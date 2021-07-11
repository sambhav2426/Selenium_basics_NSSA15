package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to scroll to a particular element
public class Tester63 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement N95Masks = driver.findElement(By.xpath("//span[text()='N95 Masks & respirators']"));//scroll till particular element
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", N95Masks);//scrollIntoView() of javaScript
		
		Thread.sleep(5000);
		driver.close();
	}

}
