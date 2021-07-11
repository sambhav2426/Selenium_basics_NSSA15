package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tester1 {
	
	private WebElement username; //declaration
	private WebElement password;
	private WebElement loginButton;
	
	public Tester1(WebDriver driver) {  //initilisation
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.name("pwd"));
		loginButton=driver.findElement(By.id("loginButton"));
	}
	public void setUsername(String usn) { //utilisation //setter method
		username.sendKeys(usn);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		loginButton.click();
	}

}
