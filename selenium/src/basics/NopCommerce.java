package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement email = driver.findElement(By.name("Email"));
		email.sendKeys("abc123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
			
	}

}
