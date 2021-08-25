package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester10 {

	public static void main(String[] args) throws InterruptedException { // Threading
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize window

		driver.get("https://www.google.com/");// launch app Thread.sleep(2000);//wait
		driver.get("http://facebook.com/");// launch app Thread.sleep(2000);
		driver.navigate().back();// navigate to google Thread.sleep(2000);
		driver.navigate().forward(); // navigate to fb Thread.sleep(2000);
		driver.navigate().refresh(); // refresh fb Thread.sleep(2000);

		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);

		driver.get("https://www.linkedin.com/");
		driver.navigate().to("https://demo.actitime.com/");// navigate to actitime(internal work opened)
		Thread.sleep(3000);
		driver.get("https://www.linkedin.com/");
		driver.get("https://demo.actitime.com");
		driver.close();// close browser
	}
}
