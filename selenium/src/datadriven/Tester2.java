package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Tester2 {
	
	@Test
	public void read() throws EncryptedDocumentException, IOException {
		FileInputStream fin=new FileInputStream("./data/data1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fin);
		
		Sheet sheet= wb.getSheet("Sheet1");
		
		System.out.println(sheet.getLastRowNum());//index value
		System.out.println(sheet.getPhysicalNumberOfRows());//actual value
		
		System.out.println(sheet.getRow(0).getLastCellNum());//index value + one
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());//actual
		
	}
}
