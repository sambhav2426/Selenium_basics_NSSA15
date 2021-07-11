package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester29 {
//WAS to validate login and logout the app
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.switchTo().activeElement().sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
	
		driver.findElement(By.id("logoutLink")).click();//throw an error
		//Note: This script will fail,because it tries to locate logout link before loading the homepage
		//so we get NoSuchException
		

	}

}
