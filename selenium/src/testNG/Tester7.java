package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tester7 {  //Passing the value from xml file to class

	@Parameters("browser")
	@Test
	public void launch(@Optional("chrome") String browser) { // if execute in class then @optional() use
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			Reporter.log("browser name is invalid", true);
		}
		driver.get("https://www.google.com/");
	}
}
