package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//WAS to handle staleElementRefernceException  by POM
public class Tester3 {
	@FindBy (id="username") //use annotaion //locate current address of element
	WebElement username;    // declaration
	
	@FindBy (name="pwd")
	WebElement password;

	@FindBy (id="loginButton")
	WebElement loginButton;
	
	public Tester3(WebDriver driver) {    //initilisation all the element
		PageFactory.initElements(driver, this);  //initElemnt use for inilisation 
		
	}
	
	public void setUsername(String usn) {   //business logics or business method in selenium point of view
		username.sendKeys(usn);	   //basically it is setter method of java point of view 
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		loginButton.click();
	}
	
}
