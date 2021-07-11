package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Assignment WAS to handle javascript- confirmation popup
public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://licindia.in/");
		
		WebElement customer = driver.findElement(By.linkText("NRI Customers"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", customer);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());//to print popup msg
		
		Thread.sleep(4000);
		alert.accept();//open external site if accept
		//alert.dismiss(); //not open external site if dismiss
		
		Thread.sleep(4000);
		driver.quit();
	}

}
