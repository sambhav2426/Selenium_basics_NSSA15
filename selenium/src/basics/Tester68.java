package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to navigate to a different URL without using get() and navigate().To()
public class Tester68 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.google.com/';");//window.location='' use to navigate in other app
		
		Thread.sleep(5000);
		driver.close();
	}
}
