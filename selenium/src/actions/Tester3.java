package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform mouse hover using overload moveByOfferset() in actitime app
public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.actitime.com/");
		
		Actions actions=new Actions(driver);		
		actions.moveByOffset(1196, 26);//mouse hovering by extension coordinates on webpage
		actions.perform();
		
		Thread.sleep(4000);
		driver.close();
	}

}