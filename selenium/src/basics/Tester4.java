package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to maximize the browser window
public class Tester4 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();  
		
		driver.manage().window().maximize();  //maximize window (method chaining) 
		
		/**
	 	Options op = driver.manage();
		Window win = op.window();
		win.maximize();
		*/
		
		driver.get("https://www.google.com/"); //launch the app
	}

}
