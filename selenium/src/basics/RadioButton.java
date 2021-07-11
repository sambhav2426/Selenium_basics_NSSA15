package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS as experiment to select radiobutton on different recharge portal
public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		 driver.get("https://www.rechargecube.in/");
		  
		 WebElement radioButton1 = driver.findElement(By.xpath("//input[@name=\"type_of_operator\" and@ value=\"2\"]"));
		 //radioButton1.click(); //ElementNotInteractableException so to overcome this javascriptExecutor use 
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", radioButton1);
	
		 if (radioButton1.isSelected()) {
			 System.out.println("Radio button for recharge is selected"); 
		 }else {
			 System.out.println("Radio button for recharge is not selected");
		 }
		 Thread.sleep(4000);

		 
		driver.get("https://www.skillrary.com/user/login");

		WebElement radioButton2 = driver.findElement(By.id("usertype_yes"));
		radioButton2.click();

		if (radioButton2.isSelected()) {
			System.out.println("Radio button of SkillRary is selected");
		} else {
			System.out.println("Radio button of SkillRary is not selected");

		}
		Thread.sleep(4000);
		
		driver.get("https://paytm.com/");
		  
		WebElement radioButton3 = driver.findElement(By.id("radio1"));
		//radioButton3.click();//StaleElementReferenceException JavascriptExecutor use to avoid this
		JavascriptExecutor js1=(JavascriptExecutor)driver;//downcast
		js1.executeScript("arguments[0].click();", radioButton3);
		if (radioButton3.isSelected()) {
			System.out.println("Radio button of Paytm is selected");
		} else {
			System.out.println("Radio button of Paytm is not selected");

		}
		Thread.sleep(4000);
		driver.close();

	}

}
