package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS as assignment to click without using overloaded parameter
public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=cucumber");
		
		Actions actions=new Actions(driver);
		actions.doubleClick();//perform double click without passing element or overload args
		actions.perform();//action will be perform on origin if args not pass (0,0)
		
		Thread.sleep(4000);
		
		actions.contextClick();//perform right click without passing element or overload args
		actions.perform();
		
		Thread.sleep(4000);
		driver.close();
	}

}
