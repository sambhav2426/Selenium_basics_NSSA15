package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS toclick on calendar and work schedule
public class A5 {

	public static void main(String[] args) {
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
		h.clickCalendarIcon();
	}

}
