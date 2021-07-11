package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester30 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicity wait or time delay for each findElement
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.switchTo().activeElement().sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
	
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();

	}

}
