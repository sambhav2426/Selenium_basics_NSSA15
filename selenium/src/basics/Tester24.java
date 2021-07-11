package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester24 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Qspider Noida");
		Thread.sleep(5000);
		username.clear();//for clear the text Field 		

	}

}
