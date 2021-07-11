package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate submit button on Vtiger app
public class Tester27 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://crmaccess.vtiger.com/log-in/");//launch app

		driver.findElement(By.name("username")).sendKeys("Qspiders");//enter UN
		driver.findElement(By.name("password")).sendKeys("Noida");   //enter password

		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();//submit button work as it show invalid credential	
		//mandatory to enter UN pwd in field otherwise submit button not work
		//follow all 4 condn
		Thread.sleep(5000);
		driver.close();
	}						

}
