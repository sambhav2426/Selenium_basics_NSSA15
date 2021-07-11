package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tester12 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle="actiTIME";
		String actualTitle = driver.getTitle();
		 
		Assert.assertEquals(actualTitle, expectedTitle);//AssertionError and script will stop and not close 
		
		driver.close();
		
	}
}
