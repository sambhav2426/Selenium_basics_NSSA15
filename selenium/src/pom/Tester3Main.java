package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to enter login credential 
public class Tester3Main {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		Tester3 test=new Tester3(driver);
		test.setUsername("admin"); //Invalid credential
		test.setPassword("admin");
		test.clickLogin();
		
		Thread.sleep(4000);
		
		test.setUsername("admin");  //valid credential
		test.setPassword("manager"); 
		test.clickLogin();      //avoid StaleElementReferenceException by POM class
	}

}
