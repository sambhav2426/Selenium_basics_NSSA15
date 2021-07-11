package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate submit button working on demo.actitime app
public class Tester26 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("loginButton")).submit();//submit button not work
		//no cond follow 
		Thread.sleep(5000);
		
		driver.close();
	}

}
