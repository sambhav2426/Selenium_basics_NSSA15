package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to locate an element using className locator
public class Tester15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.className("textField")).sendKeys("admin");//find classname
		Thread.sleep(3000);
		driver.close();

	}

}
