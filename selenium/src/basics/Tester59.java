package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to locate child elements through parents elements using FE,FEs from webdriver & webElement
public class Tester59 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement id = driver.findElement(By.id("loginFormContainer"));//parent element
		
		List<WebElement> inputs = id.findElements(By.id("username"));//child element
		System.out.println(inputs.size());
		//Heavy website which take time to find element on entire web page so it is confine
		
		driver.close();
	}

}
