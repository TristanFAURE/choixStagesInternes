package org.coordispsy.prechoice.editor.popup.actions;

import java.io.IOException;

import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.excel.ExcelInitializer;
import org.coordipsy.prechoice.prechoice.excel.InternatExcelExport;
import org.coordipsy.prechoice.prechoice.presentation.PrechoiceEditorPlugin;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.YesNoCancelListSelectionDialog;

public class GenerateExcel implements IObjectActionDelegate {

	private Shell shell;
	private PreChoix currentPrechoix;
	private static String TEMPLATE = "/template/template.xlsx" ;
	private static String TEMPLATE_INTERNAT = "/template/templateInternat.xlsx" ;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateExcel() {
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
		IFile file = getFile(currentPrechoix.eResource());
		if (file != null){
			IContainer folder = file.getParent();
			int nb = 1 ;
			IFile toCreate = folder.getFile(new Path("affectation.xlsx"));
			while (toCreate.exists()){
				toCreate = folder.getFile(new Path("affectation" + nb++ + ".xlsx"));
			}
			try {
				if (MessageDialog.openQuestion(shell, "Template Internat", "Voulez vous generer selon le format de l'internat ? si non le format standard sera généré")){
					toCreate.create(PrechoiceEditorPlugin.getPlugin().getBundle().getEntry(TEMPLATE_INTERNAT).openStream(), true, null);
					InternatExcelExport export = new InternatExcelExport(currentPrechoix,PrechoiceEditorPlugin.getPlugin().getBundle().getEntry(TEMPLATE_INTERNAT).openStream(),toCreate);
					export.generate();
				}
				else {
					toCreate.create(PrechoiceEditorPlugin.getPlugin().getBundle().getEntry(TEMPLATE).openStream(), true, null);
					ExcelInitializer excel = new ExcelInitializer(currentPrechoix,PrechoiceEditorPlugin.getPlugin().getBundle().getEntry(TEMPLATE).openStream(),toCreate);
					excel.generate();
				}
				MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Information", "Fichier excel disponible : " + toCreate.getFullPath().toString());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	private IFile getFile(Resource eResource) {
		if (eResource.getURI().isPlatformResource()){
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(eResource.getURI().toPlatformString(true)));
		}
		return null;
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
