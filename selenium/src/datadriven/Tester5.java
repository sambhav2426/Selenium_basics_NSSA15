package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tester5 {

	@Test
	public void read() throws IOException {

		FileInputStream fin = new FileInputStream("./data/data.properties");

		Properties prop = new Properties();
		prop.load(fin);

		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		WebElement usn = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
		WebElement loginBtn = driver.findElement(By.id("loginButton"));

		usn.sendKeys(username);
		pwd.sendKeys(password);
		loginBtn.click();

	}
}
