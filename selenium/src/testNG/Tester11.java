package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tester11 {
	
	@Test
	public void launchBrowser1() {
		new ChromeDriver();
	}
	
	@Test 
	public void launchBrowser2() {
		new FirefoxDriver();
	}
}
