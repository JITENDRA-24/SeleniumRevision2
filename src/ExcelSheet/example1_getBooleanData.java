package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getBooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("D:\\Daily Examples\\Revision Session2\\SeleniumRevision2.xlsx");		
		 boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(value);				
	}
}
