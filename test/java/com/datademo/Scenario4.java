package com.datademo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario4 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Pavithra MuthuKrish\\eclipse-workspace\\FrameWorks\\ExcelSheet\\Sample.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("datatask2");
		Row createRow = sheet.createRow(0);
		createRow.createCell(0).setCellValue("Hello");
		
		FileOutputStream f = new FileOutputStream(file);
		workbook.write(f);
		
	}
	

}
