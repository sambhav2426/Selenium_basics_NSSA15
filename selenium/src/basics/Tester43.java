package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate whether Administrator text is bold or not
public class Tester43 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expetedFontWeight = "700";
		
		String actualForntWeight = driver.findElement(By.id("adminCredentialsHeader")).getCssValue("font-weight");//get font text weight
		System.out.println(actualForntWeight);//700 means bold text
		
		if (actualForntWeight.equals(expetedFontWeight)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");

		}
		driver.close();
	
	}
}
