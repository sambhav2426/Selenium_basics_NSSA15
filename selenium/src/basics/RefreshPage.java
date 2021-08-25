package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		driver.get("https://demo.actitime.com/login.do");
		
		/*
		 * driver.findElement(By.className("textField")).sendKeys("admin");
		 * driver.navigate().refresh();
		 */
		WebElement usn = driver.findElement(By.className("textField"));
		usn.sendKeys("manager");
		Thread.sleep(2000);
		usn.sendKeys(Keys.F5);
		
		driver.findElement(By.className("textField")).sendKeys("admin");
		
	}
	


}
