package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to get the x and y co-ordinate of username textfield in demo.actitime.com
public class Tester45 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
	
		Point pt = username.getLocation();
		int x = pt.getX();
		int y = pt.getY();
		
		System.out.println("X co-ordinate = "+x);
		System.out.println("Y co-ordinate = "+y);
		
		driver.close();
	}

}
