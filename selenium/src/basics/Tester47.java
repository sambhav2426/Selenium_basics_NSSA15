package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to verify whether UN and Pwd text field are overlapping are not
public class Tester47 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		Point ptUsername = username.getLocation();
		int yUsername = ptUsername.getY();
		int heightUsername = username.getSize().getHeight();
		
		int overallUsernameHeight = yUsername+heightUsername;
		System.out.println("Overallheight of Username = "+overallUsernameHeight);
		
		int yPassword = driver.findElement(By.name("pwd")).getLocation().getY();
		System.out.println("yPassword = "+yPassword);
		
		if (yPassword > overallUsernameHeight) {
			System.out.println("UN and Pwd text field are not overlapping");
		}else {
			System.out.println("UN and Pwd text field are overlapping");

		}
		
		driver.close();
		
	}

}
