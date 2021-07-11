package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Tester1 {
	
	@Test
	public void read() throws EncryptedDocumentException, IOException {
		FileInputStream fin=new FileInputStream("./data/data1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fin);
		
		String value=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
		System.out.println("This is a record: "+value);
		
	}
}
