package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to handle javascript - confirmation popup
public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/alert1.html");
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		
		System.out.println(alert.getText());
		
		alert.accept();//for OK button 
		//alert.dismiss();//for cancel button
		
		Thread.sleep(3000);
		driver.close();
	}
	//at a time either accept() or dismiss() use
	//if both accept and dismiss use then NoAlertPresentException bcuz popup perform action once
}	//Can't perform action(such as SendKeys) bcuz it is not present so ElementNotInteractableException will throw
	//if neither accept nor dismiss popups use then UnhandledAlertException