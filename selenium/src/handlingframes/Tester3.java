package handlingframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to enter data  in textfield which are present inside a frame
public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/index2.html");
		
		driver.switchTo().frame("frameid");//give string argument i.e id=frameid 
		//first priority to check name if not available then check id
		
		driver.findElement(By.id("username")).sendKeys("Qspider Noida");
		
		Thread.sleep(10000);
		driver.close();
	}

}
