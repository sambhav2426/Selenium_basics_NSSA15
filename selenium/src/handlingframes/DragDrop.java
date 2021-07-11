package handlingframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS as asssignment to drag and drop within iframe
public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		WebElement dragDrop = driver.findElement(By.linkText("Droppable"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(dragDrop).click();
		actions.perform();
		
		driver.switchTo().frame(0);//switch to frame so that to perfrom drag and drop
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		/* //====Both are used for drag and drop====
		 * actions.dragAndDrop(drag, drop);//present in iframe tag which will not work
		 * actions.perform();
		 */
		//===Any one can used for drag and drop====
		actions.clickAndHold(drag).moveToElement(drop).release();
		actions.perform();
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
