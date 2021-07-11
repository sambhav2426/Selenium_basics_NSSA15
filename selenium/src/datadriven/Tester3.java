package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Tester3 {
	
	@Test
	public void read() throws EncryptedDocumentException, IOException {
		FileInputStream fin=new FileInputStream("./data/data1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fin);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
	}
}
