package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform drag and drop by using hold and release methods in htmlgoodies app
public class Tester7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement US = driver.findElement(By.id("box103"));
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(Washington).moveToElement(US).release();//hold and release
		actions.perform();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
