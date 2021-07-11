package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//WAS as experiment to perform system testing 
public class SystemTesting {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");//disable notification and pass ref var to chromebrowser
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("7701927965");
		driver.findElement(By.id("pass")).sendKeys("sameer123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
		
		WebElement account = driver.findElement(By.xpath("//div[@aria-label=\"Account\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(account).click();
		action.perform();
		Thread.sleep(3000);
		
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		action.moveToElement(logout).click();
		action.perform();
		
		Thread.sleep(3000);
		driver.close();
	

	}

}
