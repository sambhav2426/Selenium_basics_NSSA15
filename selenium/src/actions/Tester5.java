package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to perform right click in google app
public class Tester5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		
		Actions actions=new Actions(driver);
		actions.contextClick(search);//right click
		actions.perform();
		
		Thread.sleep(5000);
		driver.close();
	}
}
