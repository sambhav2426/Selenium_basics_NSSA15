package testNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tester10 {
	
	@Test
	public void launchBrowser() {
		new FirefoxDriver();
	}
}
