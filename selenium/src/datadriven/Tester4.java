package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tester4 {
	
	@Test
	public void read() throws EncryptedDocumentException, IOException {
		FileInputStream fin=new FileInputStream("./data/data1.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		
		String username1 = wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		String password1 = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		
		
		username.sendKeys(username1);
		password.sendKeys(password1);
		loginBtn.click();
	}
}
