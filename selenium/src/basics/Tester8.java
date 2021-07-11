package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate whether given text is present in the html code or not
public class Tester8 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");//launch the app
		String sourceCode =driver.getPageSource(); //html page source 

		if (sourceCode.contains("Please identify yourself")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}

		driver.close();
	}
}
