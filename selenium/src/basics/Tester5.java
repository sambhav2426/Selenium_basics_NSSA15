package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to close current browser window
public class Tester5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.get("http://www.amazon.in/"); //launch the app

		driver.close(); //close the browser

	}

}