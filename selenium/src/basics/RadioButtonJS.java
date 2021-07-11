package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Assigment WAS to click on female radio button on facebook by using JavascriptExecutor 
public class RadioButtonJS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement radioButton = driver.findElement(By.xpath("//input[@name=\"sex\" and @value='1']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", radioButton);//female radio button click
		
		Thread.sleep(5000);
		driver.close();
	}

}
