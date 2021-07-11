package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate Tooltip in demo.actitime.com
public class Tester41 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		String expectedTooltip = "Do not select if this computer is shared";
		
		String actualTooltip = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
			
		}
		driver.close();
		

	}

}
