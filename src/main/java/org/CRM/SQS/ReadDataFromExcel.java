package org.CRM.SQS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel 
{

	public static void main(String[] args) throws Exception 
	{
      FileInputStream fis = new FileInputStream("C:\\Selenium\\SeleniumData.xlsx");
      Workbook book = WorkbookFactory.create(fis);
      Sheet sh = book.getSheet("Leads");
      DataFormatter df = new DataFormatter();
      String value = df.formatCellValue(sh.getRow(5).getCell(5));
      System.out.println(value);
	}

}
