package handlingframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to enter data  in textfield which are present inside a frame
public class Tester4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/index2.html");
		
		WebElement frame = driver.findElement(By.id("frameid"));//first locate frame element and then use as ref var
		
		driver.switchTo().frame(frame);//give webElement element which is nothing but ref var used
		
		driver.findElement(By.id("username")).sendKeys("Qspider Noida");
		
		Thread.sleep(4000);
		driver.close();
	}

}
