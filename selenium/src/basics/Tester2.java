package basics;

import org.openqa.selenium.firefox.FirefoxDriver;
//WAS to launch empty firefox Browser
public class Tester2 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver(); //obj creation
		driver.manage().window().maximize();
	}

}
