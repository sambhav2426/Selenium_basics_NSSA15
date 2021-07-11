package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//WAS to handle notification popup in firefox browser
public class Tester17 {

	public static void main(String[] args) {
		
		FirefoxOptions options=new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		//disable the notification and not show which sometime block to execute script
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
	
		driver.get("https://timesofindia.indiatimes.com/");
	}

}
