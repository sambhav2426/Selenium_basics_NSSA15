package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to enter Login credential from encapsulation class
public class Tester1Main {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		
		Tester1 test=new Tester1(driver);
		test.setUsername("admin");
		test.setPassword("manager");
		test.clickLogin();
	}

}
