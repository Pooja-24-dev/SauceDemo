package SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readData {
	
	@Test
	public void read() throws IOException {
		//
		String fileName = "SauceTest.xlsx";
		
		File file = new File("C:\\java workspace\\PoojaAutomation\\src\\test\\resources\\"+fileName);	
		FileInputStream inputStream = new FileInputStream(file);		
		//xlsx
		XSSFWorkbook xlsxWorkbook = new XSSFWorkbook(inputStream);		
		//
		//HSSFWorkbook hssfWorkbook = new HSSFWorkbook(inputStream);
		Sheet sheet = xlsxWorkbook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();		
//		for(int i =0; i< rowCount; i++) {			
//			Row row = sheet.getRow(i);		
//			for(int j =0; j< row.getLastCellNum();j++) {
//				System.out.println(row.getCell(j).getStringCellValue());
//			}
//		}
		Row row = sheet.getRow(1);
		System.out.println(row.getCell(1).getStringCellValue());
		xlsxWorkbook.close();
	}

}
