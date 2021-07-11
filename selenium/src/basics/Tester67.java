package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to perform action on hidden element in facebook app
public class Tester67 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement hiddenElement = driver.findElement(By.name("custom_gender"));//locate hidden element		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Qspider Noida';", hiddenElement);//give value to hidden element
		
		Thread.sleep(10000);
		driver.close();
	
	}

}
