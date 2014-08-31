package org.coordispsy.prechoice.editor.popup.actions;

import java.util.List;

import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.excel.ExcelImporter;
import org.coordipsy.prechoice.prechoice.presentation.FileSelectionDialog;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ImportExcel implements IObjectActionDelegate {

	private Shell shell;
	private PreChoix currentPrechoix;
	private static String TEMPLATE = "/template/template.xlsx" ;
	
	
	/**
	 * Constructor for Action1.
	 */
	public ImportExcel() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		FileSelectionDialog d = new FileSelectionDialog(Display.getDefault().getActiveShell());
		if (d.open() == FileSelectionDialog.OK){
			final List<IFile> result = d.getResult();
			final EditingDomain editingDomainFor = AdapterFactoryEditingDomain.getEditingDomainFor(currentPrechoix);
			Job job = new Job("Import Interne") {
				
				protected IStatus run(IProgressMonitor arg0) {
					final BasicDiagnostic diag = new BasicDiagnostic();
					ExcelImporter importer = new ExcelImporter (editingDomainFor, currentPrechoix, result, diag, arg0);
					Command c = importer.importExcels();
					if (diag.getSeverity() == Diagnostic.ERROR){
						Display.getDefault().asyncExec(new Runnable() {
							
							public void run() {
								DiagnosticDialog dialog = new DiagnosticDialog(Display.getDefault().getActiveShell(), "Error", "Erreurs", diag, Diagnostic.ERROR);
								dialog.open();
							}
						});
					}
					editingDomainFor.getCommandStack().execute(c);
					return Status.OK_STATUS;
				}
			};
			job.setUser(true);
			job.schedule();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structured = (IStructuredSelection) selection;
			Object tmp = structured.getFirstElement();
			if (tmp instanceof PreChoix) {
				currentPrechoix = (PreChoix) tmp;
			}
		}
	}

}
