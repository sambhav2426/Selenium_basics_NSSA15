package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate the url of demo.actitime app login page
public class Tester9 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.get("https://www.naukri.com/");//launch app
		Set<String> windows=driver.getWindowHandles();//handles all apps or collect browsers (collection)
		for(String window : windows) {       //each for loop
			driver.switchTo().window(window);//switch to each window
			System.out.println(driver.getTitle());//launch Title of each window
		}
		driver.quit();//close all the browsers
	}
}