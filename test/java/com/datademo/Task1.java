package com.datademo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {
	public static void main(String[] args) throws IOException {
		File file  = new File("C:\\Users\\Pavithra MuthuKrish\\eclipse-workspace\\FrameWorks\\ExcelSheet\\datas.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("datas");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			
			CellType cellType = cell.getCellType();
			//System.out.println(cellType);
			
			//String
			
			switch (cellType) {
			case STRING:
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
				break;
				
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MMMM-yyy");
					String format = DateFormat.format(date);
					System.out.println(format);
				}
				else
				{
					double numericCellValue = cell.getNumericCellValue();
					BigDecimal valueOf = BigDecimal.valueOf(j);
					String string = valueOf.toString();
					System.out.println(string);	
				}
				break;
			
					}
			
		}
			
		}
	}
}
		
	
		
		
	
	
	
	
