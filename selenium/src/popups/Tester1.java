package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to handle javascript - alert popup
public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/alert.html");
		
		Alert alert = driver.switchTo().alert();//return type is Alert interface
		Thread.sleep(4000);
		
		System.out.println(alert.getText());//to print alert msg before accept or dismiss
		System.out.println(alert.hashCode());//to print hashcode
		
		//alert.accept(); //for OK 
		alert.dismiss();  //for Ok bcuz ony one button present here
	
		Thread.sleep(4000);
		driver.close();
		
	}//at a time either accept() or dismiss() use
	 //if both accept and dismiss use then NoAlertPresentException bcuz popup perform action once
}	 //Can't perform action(such as SendKeys) bcuz it is not present so ElementNotInteractableException will throw
     //if neither accept nor dismiss popups use then UnhandledAlertException