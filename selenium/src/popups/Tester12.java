package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to open developer tool using robot class
public class Tester12 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);//shortcut key use Ctrl+Shift+I
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_I);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_I);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
