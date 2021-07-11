package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester23 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement loginButton	=driver.findElement(By.id("loginButton"));
		
		loginButton.sendKeys(Keys.ENTER);//Enter login button //Keys is Enumeration 
		
	}

}
