package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to enter data in upper case in demo.actitime app
public class Tester9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.SHIFT);//pressed Shift
		actions.sendKeys(username, "admin");//show in Upper case as ADMIN
		actions.keyUp(Keys.SHIFT);//release Shift
		actions.perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
