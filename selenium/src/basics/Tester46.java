package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate the left allignment of email and password textfield in facebook.app
public class Tester46 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Point ptEmail = driver.findElement(By.id("email")).getLocation();
		int xEmail = ptEmail.getX();
		System.out.println(xEmail);
		
		Point ptPassword = driver.findElement(By.id("passContainer")).getLocation();
		int xPassword = ptPassword.getX();
		System.out.println(xPassword);
		
		if (xEmail==xPassword) {
			System.out.println("Left allignment of Email and Pwd is correct");
		}else {
			System.out.println("Left allignment of Email and Pwd is incorrect");

		}
		
		driver.close();
		
	}

}
