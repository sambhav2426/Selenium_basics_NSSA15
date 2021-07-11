package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to check checkbox using javascript code in demo.actitime app
public class Tester66 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].checked='true';", checkbox);//use to checked="true" give boolean value (java rules)//checked="" then not click on checkbox
		Thread.sleep(5000);
		
		//js.executeScript("arguments[0].click();", checkbox);//use to click unchecked
		//Thread.sleep(5000);
		
		 driver.close();
	}
}
