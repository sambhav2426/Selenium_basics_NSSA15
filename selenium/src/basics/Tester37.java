package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to add custom wait
public class Tester37 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		while (true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			} catch (NoSuchElementException e) {
				System.out.println("Element not loaded");
			}
		}
		driver.close();
	}

}
