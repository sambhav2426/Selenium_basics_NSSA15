package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate the url of demo.actitime app login page
public class Tester7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.get("https://demo.actitime.com/login.do"); //launch the app
		String expectedurl="https://demo.actitime.com/login.do"; //expected URL
		String actualurl =driver.getCurrentUrl(); //current URL in the app
		
		if (actualurl.equals(expectedurl)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		
		driver.close();//close the browser
	}
}
