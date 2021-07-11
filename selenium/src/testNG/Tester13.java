package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Tester13 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle="actiTIME ";
		String actualTitle = driver.getTitle();
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle); // if error occur then it will neither throw error nor stop execution but for throw error we use assertAll()
		
		driver.close();
		
		sa.assertAll();//use for show error if find error 
	}
}
