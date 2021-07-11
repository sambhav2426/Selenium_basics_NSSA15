package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to verify whether  UN and Pwd are overlapping or not by using getRect()
public class Tester48 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		Rectangle rectUsername = username.getRect();//get height, width, x and y co-ordinate
		int yUsername = rectUsername.getY();
		int heightUsername = rectUsername.height;
		
		int overallUsernameHeight = yUsername+heightUsername;
		System.out.println("Overallheight of Username = "+overallUsernameHeight);
		
		int yPassword = driver.findElement(By.name("pwd")).getRect().getY();
		System.out.println("yPassword = "+yPassword);
		
		if (yPassword > overallUsernameHeight) {
			System.out.println("UN and Pwd text field are not overlapping");
		}else {
			System.out.println("UN and Pwd text field are overlapping");

		}
		
		driver.close();
		
	}

}
