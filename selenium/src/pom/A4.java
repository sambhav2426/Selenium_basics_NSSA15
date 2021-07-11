package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage l=new LoginPage(driver);
		l.setUsername("admin");
		l.setPassword("manager");
		l.clickKeepLoggedCheckbox();
		l.clickLogin();
		
		HomePage h=new HomePage(driver);
		h.clickUserContainer();
		Thread.sleep(5000);
		h.clickSwitchActiPlan();
		Thread.sleep(5000);
		h.clickLogout();
		
	}

}
