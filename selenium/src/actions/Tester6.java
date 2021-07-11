package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform drag and drop in dhtmlgoodies app
public class Tester6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement US = driver.findElement(By.id("box103"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(Washington, US);//drag and drop
		actions.perform();
		
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Italy = driver.findElement(By.id("box106"));
		
		Actions actions2=new Actions(driver);
		actions2.dragAndDrop(Rome, Italy);//drag and drop
		actions2.perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
