package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (id = "username")
	private WebElement username;
	@FindBy (name = "pwd")
	private WebElement password;
	@FindBy (id = "loginButton")
	private WebElement loginButton;
	@FindBy (id ="keepLoggedInLabel")
	private WebElement keepLoggedCheckbox;
	@FindBy (id = "toPasswordRecoveryPageLink")
	private WebElement forgotYourPassword;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String usn) {
		username.sendKeys(usn);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		loginButton.click();
	}
	public void clickKeepLoggedCheckbox() {
		keepLoggedCheckbox.click();
	}
	public void clickForgotYourPassword() {
		forgotYourPassword.click();
	}
}
