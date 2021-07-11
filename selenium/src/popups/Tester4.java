package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to handle  hidden division popup
public class Tester4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/../..//input[@autocomplete=\"off\"]")).sendKeys("8744071160");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Enter Password']/../..//input[@type='password']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
