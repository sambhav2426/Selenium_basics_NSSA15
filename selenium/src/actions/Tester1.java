package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform mouse hovering in actitime.com
public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.actitime.com/");
		WebElement pricing = driver.findElement(By.linkText("Pricing"));//locate element for mouse hover
		
		Actions actions =new Actions(driver);
		actions.moveToElement(pricing);//hovering mouse on pricing
		actions.perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
