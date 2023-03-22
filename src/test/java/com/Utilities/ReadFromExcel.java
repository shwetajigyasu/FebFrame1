package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadFromExcel {
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
	
	
	public static int GetRowCount(String xlfile ,String sheetname ) throws IOException {
		
		fis=new FileInputStream(xlfile);
		                    
		 wb  =new XSSFWorkbook(fis);
		 sheet=wb.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum();
		wb.close();
		fis.close();
		return rowcount;	
	}
	
public static int GetCellCount(String xlfile ,String sheetname ,int rownum) throws IOException {
		
		fis=new FileInputStream(xlfile);
		                    
		 wb  =new XSSFWorkbook(fis);
		 sheet=wb.getSheet(sheetname);
		 Row row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fis.close();
		return cellcount;	
	}
	
public static String GetCellData(String xlfile ,String sheetname ,int rownum , int columnum) throws IOException {
	
	fis=new FileInputStream(xlfile);
	                    
	 wb  =new XSSFWorkbook(fis);
	 sheet=wb.getSheet(sheetname);
	 Row row=sheet.getRow(rownum);
	Cell cell=row.getCell(columnum);
	String Data;
	try {
		DataFormatter formatter=new DataFormatter();
		  String cellData =formatter.formatCellValue(cell);
		return cellData;	
	}catch(Exception e){
		Data="";
	}
	fis.close();
	wb.close();
	return Data;
}

public static void setCellData(String xlfile ,String sheetname ,int rownum , int columnum,String Data) throws IOException {

	fis=new FileInputStream(xlfile);
	                    
	 wb  =new XSSFWorkbook(fis);
	 sheet=wb.getSheet(sheetname);
	 Row row=sheet.getRow(rownum);
	 
	 Cell cell= row.createCell(columnum);
	 cell.setCellValue(Data);
}



}
 