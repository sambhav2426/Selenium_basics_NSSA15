package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate whether radio button is selected or not
public class Tester39 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@name='sex' and@value=\"1\"]"));
		femaleRadioButton.click();
		
		if (femaleRadioButton.isSelected()) {
			System.out.println("Radio button is selected");
		}else {
			System.out.println("Radio button is not selected");
		}
		driver.close();
	}

}
