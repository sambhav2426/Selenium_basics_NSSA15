package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//WAS to add explicit wait to get the title of homepage
public class Tester34 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// implicit wait

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);// Explicit Wait
		wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
		// conditions given by urlToBe
		System.out.println(driver.getTitle());
		driver.close();

	}

}
