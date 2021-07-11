package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to enter login credential
public class Tester2Main {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		
		Tester2 test=new Tester2(driver);
		test.setUsername("admin");
		test.setPassword("admin"); //invalid credential
		test.clickLogin();
		
		Thread.sleep(4000);
		 
		test.setUsername("admin");   //valid credential
		test.setPassword("manager");
		test.clickLogin();            //StaleElementReferenceException
	}

}
