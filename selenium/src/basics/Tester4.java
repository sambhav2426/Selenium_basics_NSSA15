package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to maximize the browser window
public class Tester4 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();  
		
		driver.manage().window().maximize();  //maximize window (method chaining) 
		driver.get("https://www.google.com/"); //launch the app

	}

}
