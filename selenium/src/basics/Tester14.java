package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to locate an element using name locator
public class Tester14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.name("pwd")).sendKeys("manager");// to find name locator and enter data
		Thread.sleep(3000);
		driver.close();
	}

}
