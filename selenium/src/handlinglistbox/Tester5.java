package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS to select and deselect option in multi-select listbox using select clas method
public class Tester5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/index3.html");
		
		WebElement manual = driver.findElement(By.id("Manual"));
		Select select=new Select(manual);
		
		select.selectByIndex(0);//select 
		Thread.sleep(2000);
		
		select.deselectByIndex(0);//deselect 
		Thread.sleep(2000);
		
		select.selectByValue("s");//select 
		Thread.sleep(2000);
		
		select.deselectByValue("s");//deselect
		Thread.sleep(2000);

		select.selectByVisibleText("Adhoc");//select
		Thread.sleep(2000);

		select.deselectByVisibleText("Adhoc");//deselect 
		Thread.sleep(2000);

		driver.close();
	}

}
