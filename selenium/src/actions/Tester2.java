package actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform mouse hover action using overload moveToElement() in actitime appl
public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.actitime.com/");
		
		WebElement pricing = driver.findElement(By.linkText("Pricing"));
		Dimension dim = pricing.getSize();
		int centerY = dim.getHeight()/2;
		int centerX = dim.getWidth()/2;
		
		Actions actions=new Actions(driver);
		//actions.moveToElement(pricing, centerX+100, centerY);
		actions.moveToElement(pricing, centerX-100, centerY);//locate particular element but mouse hover on other acc X and Y coordinate
		actions.perform();
		
		Thread.sleep(4000);
		driver.close();
	}//mouse hovering by actual cursor or simulation means movement happen without cursor moving
}