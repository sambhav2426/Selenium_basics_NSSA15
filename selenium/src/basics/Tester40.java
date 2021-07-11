package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate the placeholder of usernametextfield in demo.actitime.com
public class Tester40 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		String expectedplaceholder = "Username";
		String actualPlaceholder = driver.findElement(By.id("username")).getAttribute("placeholder");
		
		if (actualPlaceholder!=null) {
			if (expectedplaceholder.equals(actualPlaceholder)) {
				System.out.println("Test case passed");
			}else {
				System.out.println("Test case failed");
			}
		}else {
			System.out.println("Attribute is not present");
		}
		
		driver.close();
	}

}
