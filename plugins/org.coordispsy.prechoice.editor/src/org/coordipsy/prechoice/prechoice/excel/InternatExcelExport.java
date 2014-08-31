package org.coordipsy.prechoice.prechoice.excel;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.coordipsy.prechoice.prechoice.Dossier;
import org.coordipsy.prechoice.prechoice.ETAT_INTERNE;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.Stage;
import org.coordipsy.prechoice.prechoice.presentation.InterneComparator;
import org.coordipsy.prechoice.prechoice.utils.GetAll;
import org.coordipsy.prechoice.prechoice.utils.Utils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class InternatExcelExport {

	private final PreChoix preChoix;
	private final InputStream inputStream;
	private final IFile file;

	public InternatExcelExport(PreChoix currentPrechoix,
			InputStream inputStream, IFile toCreate) {
		this.preChoix = currentPrechoix;
		this.inputStream = inputStream;
		this.file = toCreate;
	}

	public void generate() {
		try {
			List<Interne> internes = new GetAll<Interne>(Interne.class)
					.getAll(preChoix);
			Collections.sort(internes,new InterneComparator());
			XSSFWorkbook workbok = new XSSFWorkbook(inputStream);
			
			XSSFSheet sheet = workbok.getSheetAt(0);
			XSSFRow firstRow = sheet.getRow(0);
			int i = 1;
			for (Interne interne : internes) {
				XSSFRow row = sheet.createRow(i);
				// static value
				XSSFCell cell = createCell(row,0,1,firstRow);
				
				// name
				createCell(row,1,interne.getNom().toUpperCase() + " " + interne.getPrenom(),firstRow);
				
				// semestre
				createCell(row, 2, interne.getPromotion() * -1,firstRow);
				
				// classement
				createCell(row, 3, interne.getClassement(),firstRow);
				
				
				// annee
				createCell(row, 4, Double.valueOf(((Dossier)interne.eContainer()).getNom()),firstRow);
				
				// static vaue : Psychiatrie
				createCell(row, 5, "Psychiatrie",firstRow);
				createCell(row, 6, "Psychiatrie",firstRow);
				
				
				// cursus
				createCell(row, 7, interne.getEtat().getLiteral(),firstRow);
				createCell(row,8, "", firstRow);

				int counter = 0 ;
				for (Stage s : interne.getChoix()){
					int start = 8 ;
					int num = start + 1 + (counter * 4) ;
					int docteur = start + 2 + (counter * 4) ;
					int label = start + 3 + (counter * 4);
					int location = start + 4 + (counter * 4);
					createCell(row, num, s.getNumber(), firstRow);
					createCell(row, docteur, s.getDocteur(), firstRow);
					createCell(row, label, s.getLabel(), firstRow);
					createCell(row, location, s.getLocation(), firstRow);
					createCell(row, 6, interne.getEtat().getLiteral(),firstRow);
					counter ++ ;
				}
				
				Color aColor = new Color(255, 255, 255);
				switch (interne.getEtat().getValue()) {
				case ETAT_INTERNE.DISPO_CP_VALUE:
				case ETAT_INTERNE.DISPO_M_VALUE:
					aColor = new Color(146, 208, 80);
					break;
				case ETAT_INTERNE.DOM_TOM_VALUE:
					aColor = new Color(183, 222, 232);
					break;
				case ETAT_INTERNE.SURNOMBRE_NV_VALUE:
				case ETAT_INTERNE.DROITREMORD_VALUE:
					aColor = new Color(242, 220, 219);
					break;
				default:
					break;
				}
				XSSFColor color = new XSSFColor(aColor);
				changeColor(row,color);
				XSSFCellStyle rowStyle = firstRow.getRowStyle();
				XSSFCellStyle newStyle = workbok.createCellStyle();
				newStyle.cloneStyleFrom(rowStyle);
				newStyle.setFillForegroundColor(color);
				newStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				row.setRowStyle(newStyle);
				
				i++;
			}
			i = 1;
			FileOutputStream outputStream = new FileOutputStream(new File(file
					.getLocationURI().getPath()));
			workbok.write(outputStream);
			outputStream.close();
			file.refreshLocal(IResource.DEPTH_ONE, null);
			// file.create(new PipedInputStream(outputStream), true, null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private XSSFCellStyle createStyle(XSSFWorkbook workbok, XSSFColor color) {
		XSSFCellStyle style = workbok.createCellStyle();
		style.setFillBackgroundColor(color);
//		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		return style;
	}

	private void changeColor(XSSFRow row, XSSFColor color) {
		Iterator<Cell> i = row.cellIterator();
		while (i.hasNext()){
			Cell c = i.next();
			CellStyle style = c.getCellStyle();
			if (style instanceof XSSFCellStyle) {
				XSSFCellStyle cellStyleXSSF = (XSSFCellStyle) style;
				XSSFCellStyle newStyle = row.getSheet().getWorkbook().createCellStyle();
				newStyle.cloneStyleFrom(cellStyleXSSF);
				newStyle.setFillForegroundColor(color);
				newStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				c.setCellStyle(newStyle);
			}
		}
		
	}

	private XSSFCell createCell(XSSFRow row, int i, String val, XSSFRow firstRow) {
		XSSFCell cell = row.createCell(i);
		XSSFCell firstCell = firstRow.getCell(i);
		cell.setCellValue(val);
		cell.setCellStyle(firstCell.getCellStyle());
		return cell;
	}
	
	private XSSFCell createCell(XSSFRow row, int i, double val, XSSFRow firstRow) {
		XSSFCell cell = row.createCell(i);
		XSSFCell firstCell = firstRow.getCell(i);
		cell.setCellValue(val);
		cell.setCellStyle(firstCell.getCellStyle());
		return cell;
	}

}
