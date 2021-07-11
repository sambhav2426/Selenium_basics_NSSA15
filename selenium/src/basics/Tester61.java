package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS  to perform vertical scrolling using java script executor()
public class Tester61 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800);");//+y scroll down
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-600);");//-y scroll down
		Thread.sleep(5000);
		
		driver.close();
	}
	
}
