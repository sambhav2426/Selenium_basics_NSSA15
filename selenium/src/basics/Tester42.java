package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
//WAS to validate the color of Username textfield in demo.actitime
public class Tester42 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String actualHex = "#000000";
		
		String colorValue = driver.findElement(By.id("username")).getCssValue("color");//get color value
		System.out.println(colorValue);//rgba(0, 0, 0, 1)
		
		String expectedHex = Color.fromString(colorValue).asHex();//convert RGB color value to Hexadecimal code
		
		if (actualHex.equals(expectedHex)) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test case is failed");

		}
		
		driver.close();
	}
}

