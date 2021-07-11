package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//WAS to add explicit wait to get the title of homepage
public class Tester35 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// implicit wait

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		WebElement logoutLink = driver.findElement(By.id("logoutLink"));

		WebDriverWait wait = new WebDriverWait(driver, 20);// Explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		// elementToBeClickable by webElement ref var ie logoutLink

		System.out.println(driver.getTitle());
		driver.close();

	}

}
