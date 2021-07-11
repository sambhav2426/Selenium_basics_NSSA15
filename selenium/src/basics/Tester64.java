package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to perform action on disabled element
public class Tester64 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabled = driver.findElement(By.xpath("//input[@class=\"form-control\"]"));//locate disable element
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Qspiders noida';", disabled);//give value to disabled element by using valu() of JS
		
		Thread.sleep(5000);
		driver.close();
	}

}
