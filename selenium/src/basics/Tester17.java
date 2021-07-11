package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester17 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.partialLinkText("Forgot ")).click();//to find partialLink Text(use for lengthy text)
		Thread.sleep(3000);
		driver.close();

	}

}
