package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS as experiment to signIn on LinkedIn app
public class SignIn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");

		driver.findElement(By.cssSelector("a[class=\"nav__button-secondary\"]")).click(); // click on sign in button

		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("sima13570@gmail.com");// username enter

		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("sima13570");// password enter

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();//click on submit

		Thread.sleep(3000);
		driver.close();

	}

}