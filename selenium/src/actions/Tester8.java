package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform control click on Amazon app 
public class Tester8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL);//pressed ctrl
		actions.click(mobiles);//open in new tab
		actions.keyUp(Keys.CONTROL);//release Ctrl
		actions.perform();
		
		Thread.sleep(8000);
		driver.quit();//to close all browser
	}

}
