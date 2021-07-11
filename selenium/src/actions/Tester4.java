package actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform double click on + button in demo.skillrary app with end-to-end scenerio
public class Tester4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/");
		
		driver.findElement(By.partialLinkText("GEARS")).click();
		driver.findElement(By.partialLinkText("SkillRary Demo APP")).click();
		
		Set<String> windows = driver.getWindowHandles();
		//as browser open in new window so we need to use getWindowHandle()
		
		for (String window : windows) {
			driver.switchTo().window(window);//switch to new window
		}
		WebElement course = driver.findElement(By.id("course")); //locate element by id
		
		Actions actions=new Actions(driver);
		actions.moveToElement(course); //mouse hover by ref var
		//actions.moveByOffset(470, 27); //mouse hover by cordinator
		//actions.moveToElement(course, centerX, centerY+50);//this will not work bcuz mouse hover not happen, perform() not use and centerY+50 not work at that time
		actions.perform();
		
		driver.findElement(By.linkText("Selenium Training")).click();
		
		WebElement plsbtn = driver.findElement(By.id("add"));
		
		actions.doubleClick(plsbtn);//doubleClick to add into cart
		actions.perform();
		
		Thread.sleep(3000);
		driver.quit();//use to close all window 
	}

	
}
