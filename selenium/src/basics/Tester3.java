package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to launch google app in Chrome Browser
public class Tester3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); //obj create of Chromedriver and upcast in WebDriver
		 driver.get("https://www.google.com/"); //navigate to URL //launch the app
		
	}

}
