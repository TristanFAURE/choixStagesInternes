package org.coordipsy.prechoice.prechoice.excel;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;
import org.coordipsy.prechoice.prechoice.Stage;
import org.coordipsy.prechoice.prechoice.presentation.PrechoiceEditorPlugin;
import org.coordipsy.prechoice.prechoice.utils.Utils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class ExcelImporter {

	private final EditingDomain editingDomainFor;
	private final PreChoix currentPrechoix;
	private final List<IFile> listToManage;
	private final BasicDiagnostic d;
	private final IProgressMonitor monitor;

	public ExcelImporter(EditingDomain editingDomainFor,
			PreChoix currentPrechoix, List<IFile> listToManage, BasicDiagnostic d, IProgressMonitor monitor) {
		this.editingDomainFor = editingDomainFor;
		this.currentPrechoix = currentPrechoix;
		this.listToManage = listToManage;
		this.d = d;
		this.monitor = monitor;
	}
	
	public Command importExcels (){
		CompoundCommand result = new CompoundCommand();
		monitor.beginTask("import", listToManage.size());
		for (IFile f : listToManage){
			monitor.subTask(f.getName());
			Command importExcel = importExcel(f);
			if (importExcel != null){
				result.append(importExcel);
			}
			monitor.worked(1);
		}
		return result ;
	}

	private Command importExcel(IFile f) {
		CompoundCommand result = new CompoundCommand();
		try {
			InputStream contents = f.getContents();
			XSSFWorkbook wbk = new XSSFWorkbook(contents);
			XSSFSheet sheet = wbk.getSheetAt(0);
			// retrieve interne
			Interne interne = getInterne(getInterne(sheet));
			if (interne == null){
				addError(String.format("aucun interne trouve dans %s", f.getName()));
				return null ;
			}
			List<XSSFCell> cells = getCellForChoice(sheet);
			RemoveCommand rem = new RemoveCommand(editingDomainFor, interne.getChoix(), interne.getChoix());
			result.append(rem);
			for (XSSFCell c : cells){
				String stringCellValue = c.getStringCellValue();
				if (stringCellValue != null){
					Stage s = getStage (stringCellValue);
					if (s == null && stringCellValue.trim().length() != 0){
						addError(String.format("le stage %s n a pas ete trouve dans %s", stringCellValue, f.getName()));
					}
					if (s!=null){
						AddCommand add = new AddCommand(editingDomainFor, interne, PrechoicePackage.Literals.INTERNE__CHOIX, s);
						result.append(add);
					}
				}
			}
			contents.close();
		} catch (IOException e) {
			addError(String.format("une erreur s'est produite : %s", getExceptionMessage(e), f.getName()));
		} catch (CoreException e) {
			addError(String.format("une erreur s'est produite : %s", getExceptionMessage(e), f.getName()));
		}
		return result ;
	}
	
	public String getExceptionMessage(Throwable e){
		StringWriter w = new StringWriter();
		e.printStackTrace(new PrintWriter(w));
		return w.getBuffer().toString();
		
	}
	
	private Stage getStage(String stageName) {
		for (Iterator<EObject> i = currentPrechoix.eAllContents() ; i.hasNext() ; ){
			EObject next = i.next();
			if (next instanceof Stage) {
				Stage stage = (Stage) next;
				if (stageName.equals(stage.getNom())){
					return stage;
				}
			}
		}
		return null ;
	}

	public void addError (String message){
		d.add(new BasicDiagnostic(Diagnostic.ERROR,PrechoiceEditorPlugin.INSTANCE.getSymbolicName(),Diagnostic.ERROR,message,null));
	}
	
	protected Interne getInterne(String interneName) {
		for (Iterator<EObject> i = currentPrechoix.eAllContents() ; i.hasNext() ; ){
			EObject next = i.next();
			if (next instanceof Interne) {
				Interne interne = (Interne) next;
				if (interneName.equals(Utils.getInterneName(interne))){
					return interne;
				}
			}
		}
		return null ;
	}

	protected List<XSSFCell> getCellForChoice (XSSFSheet sheet)
	{
		List<XSSFCell> result = new LinkedList<XSSFCell>();
		int row = 4;
		for (int i = row ; i < 9 ; i++){
			XSSFRow aRow = sheet.getRow(i);
			if (aRow != null){
				XSSFCell cell = aRow.getCell(1);
				if (cell != null){
					result.add(cell);
				}
			}
		}
		return result ;
	}
	
	protected String getInterne (XSSFSheet sheet) {
		XSSFRow row = sheet.getRow(1);
		if (row != null){
			XSSFCell cell = row.getCell(1);
			if (cell != null){
				return cell.getStringCellValue();
			}
		}
		return null ;
	}

}
