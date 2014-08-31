package org.coordipsy.prechoice.prechoice.presentation;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class FileSelectionDialog extends Dialog {

	private java.util.List<IFile> filesToImport = new LinkedList<IFile>();
	
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public FileSelectionDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		final ListViewer listViewer = new ListViewer(composite, SWT.BORDER | SWT.V_SCROLL);
		List list = listViewer.getList();
		list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		listViewer.setContentProvider(new ArrayContentProvider());
		listViewer.setLabelProvider(new WorkbenchLabelProvider());
		listViewer.setInput(filesToImport);
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		composite_1.setLayout(new RowLayout(SWT.VERTICAL));
		
		Button btnNewButton = new Button(composite_1, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog d = new ElementTreeSelectionDialog(Display.getDefault().getActiveShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
				d.setInput(ResourcesPlugin.getWorkspace().getRoot());
				d.addFilter(new ViewerFilter() {
					
					@Override
					public boolean select(Viewer arg0, Object arg1, Object arg2) {
						return arg2 instanceof IContainer || (arg2 instanceof IFile && "xlsx".equals(((IFile)arg2).getFileExtension()));
					}
				});
				d.setValidator(new ISelectionStatusValidator(){

					public IStatus validate(Object[] arg0) {
						for (Object o : arg0){
							if (!(o instanceof IFile && "xlsx".equals(((IFile)o).getFileExtension()))){
								return new Status(IStatus.ERROR,PrechoiceEditorPlugin.getPlugin().getSymbolicName(),"un fichier xlsx est requis");
							}
						}
						return Status.OK_STATUS;
					}
					
				});
				d.setAllowMultiple(true);
				if (d.open() == ElementTreeSelectionDialog.OK){
					Object[] result = d.getResult();
					for (Object o : result){
						filesToImport.add((IFile) o);
					}
					listViewer.refresh();
				}
			}
		});
		btnNewButton.setText("Add ...");
		
		Button btnNewButton_1 = new Button(composite_1, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ISelection selec = listViewer.getSelection();
				if (selec instanceof IStructuredSelection) {
					IStructuredSelection struc = (IStructuredSelection) selec;
					for (Iterator<?> i = struc.iterator() ; i.hasNext() ;){
						filesToImport.remove(i.next());
					}
				}
				listViewer.refresh();
			}
		});
		btnNewButton_1.setText("Remove ...");

		return container;
	}
	
	public java.util.List<IFile> getResult (){
		return Collections.unmodifiableList(filesToImport);
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
}
