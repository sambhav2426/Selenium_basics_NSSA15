package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//WAS to handle file download popup in selenium.dev app
public class Tester13 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.linkText("DOWNLOAD")).click();
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ALT); //use shortcut key Alt+S 
		robot.keyPress(KeyEvent.VK_S);
		
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_S);
		
		robot.keyPress(KeyEvent.VK_ENTER);//As enter then download will start
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
