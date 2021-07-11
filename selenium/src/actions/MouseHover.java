package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Assignment WAS to perform mouse hover on resources and click on
public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.id("navbarDocumentation"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(resources);//mouse hover 
		actions.perform();
		
		driver.findElement(By.partialLinkText("Webinars")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
