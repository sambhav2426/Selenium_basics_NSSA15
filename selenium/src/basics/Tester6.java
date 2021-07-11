package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate the Title of demo.actitime app
public class Tester6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.get("https://demo.actitime.com/login.do"); //launch the app
		String expectedTitle="actiTIME - Login";//expected title 
		String actualTitle=driver.getTitle();   //launch actual Title (show in Tab)
		
		if (actualTitle.equals(expectedTitle)) { 
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		
		driver.close(); //close the browser
	}
}
