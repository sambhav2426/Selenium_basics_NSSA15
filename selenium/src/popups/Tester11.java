package popups;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester11 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.mouseWheel(1000);//scrolling
		
	
	}

}