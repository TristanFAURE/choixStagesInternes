package org.coordipsy.prechoice.prechoice.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.Stage;
import org.coordipsy.prechoice.prechoice.utils.GetAll;
import org.coordipsy.prechoice.prechoice.utils.Utils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class ExcelInitializer {
	private final IFile file;
	private PreChoix preChoix;
	private final InputStream inputStream;

	public ExcelInitializer(PreChoix prechoix, InputStream inputStream, IFile fileToCreate) {
		this.preChoix = prechoix;
		this.inputStream = inputStream;
		this.file = fileToCreate;
	}
	
	public void generate(){
		 try {
			List<Interne> internes = new GetAll<Interne>(Interne.class).getAll(preChoix);
			List<Stage> stages = new GetAll<Stage>(Stage.class).getAll(preChoix);
			Collections.sort(internes, new Comparator<Interne>() {
				public int compare(Interne o1, Interne o2) {
					String s = o1.getNom() + " " + o1.getPrenom();
					String s2 = o2.getNom()+ " " + o2.getPrenom();
					return s.compareTo(s2);
				}
			});
			Collections.sort(stages, new Comparator<Stage>() {
				public int compare(Stage o1, Stage o2) {
					String s = o1.getNom();
					String s2 = o2.getNom();
					return s.compareTo(s2);
				}
			});
			XSSFWorkbook workbok = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbok.getSheetAt(1);
			int i = 1 ;
			for (Interne interne : internes)
			{
				XSSFRow row = sheet.createRow(i);
				XSSFCell cell = row.createCell(0);
				cell.setCellValue(Utils.getInterneName(interne));
				i++;
			}
			i = 1;
			for (Stage s : stages)
			{
				XSSFRow row = sheet.getRow(i);
				if (row == null){
					row = sheet.createRow(i);
				}
				XSSFCell cell = row.createCell(1);
				cell.setCellValue(s.getNom());
				i++;
			}
			FileOutputStream outputStream = new FileOutputStream(new File(file.getLocationURI().getPath()));
			workbok.write(outputStream);
			outputStream.close();
			file.refreshLocal(IResource.DEPTH_ONE, null);
//			file.create(new PipedInputStream(outputStream), true, null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
