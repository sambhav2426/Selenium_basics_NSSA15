package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to validate the elements on login page and validate whether homepages is displayed or not
public class Tester20 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		WebElement username = driver.findElement(By.id("username"));// findElement is return type which return in
																	// WebElemnt i.e local var
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.id("loginButton"));

		if (username.isDisplayed()) {
			System.out.println("Username Text field is Displayed");
		} else {
			System.out.println("Username Text field is not displayed");
		}
		if (password.isDisplayed()) {
			System.out.println("Password Text field is displayed");
		} else {
			System.out.println("Password Text field is not displayed");
		}
		if (loginButton.isDisplayed()) {
			System.out.println("Login Button is displayed");
		} else {
			System.out.println("Login button is not displayed");
		}

		username.sendKeys("admin");
		password.sendKeys("manager");
		loginButton.click();

		Thread.sleep(3000);// delay is use for the get Title//time delay while loading title
		String expectedTitle = "actiTIME - Enter Time-Track";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Homepage is displayed");
		} else {
			System.out.println("Homepage is not displayed");
		}

		driver.close();

	}

}