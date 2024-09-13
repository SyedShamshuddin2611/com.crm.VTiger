package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{

	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception 
	{
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;

	}

public void writeDataInExcel (String sheetName, int rowNum, int cellNum, String value) throws Exception 
{
	FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheetName);
	sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
	FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);
	book.write(fos);
}
			
}
