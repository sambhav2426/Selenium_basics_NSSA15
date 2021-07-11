package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//WAS to handle javascript - prompt popup
public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();//Bug in chromedriver, not receive input
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/alert2.html");
		
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(2000);
	
		String msg = prompt.getText();
		System.out.println(msg);
		
		prompt.sendKeys("Qspiders Noida");//to send input to prompt popup
		Thread.sleep(3000);
		
		prompt.accept(); // for OK button 
		//if neither accept nor dismiss popups use then UnhandledAlertException
		Thread.sleep(2000);
		driver.close();
	}

}
