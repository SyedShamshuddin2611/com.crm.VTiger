package org.CRM.SQS;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenericLibrary.IconstantUtility;

public class WriteorEnterDataInExcel 
{

	public static void main(String[] args) throws Exception 
	{
      FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
      Workbook book = WorkbookFactory.create(fis);
      Sheet sh = book.getSheet("Leads");
      
      sh.createRow(2).createCell(5).setCellValue("RAJA");
      FileOutputStream fos = new FileOutputStream (IconstantUtility.excelPath);
      book.write(fos);
      
	}

}
