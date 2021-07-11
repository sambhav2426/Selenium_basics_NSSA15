package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS to select and deselect all the option one by one using select class method
public class Tester7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/index3.html");
		WebElement manual = driver.findElement(By.id("Manual"));
		
		Select select=new Select(manual);
		List<WebElement> options = select.getOptions();
		
		for (WebElement option : options) {
			select.selectByVisibleText(option.getText());//select byvisibleText
			Thread.sleep(1000);
		}
		
		for (WebElement option : options) {
			select.deselectByVisibleText(option.getText());//deselectByVisibleText
			Thread.sleep(1000);
		}
		
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);//select by simple loop and index 
			Thread.sleep(1000);
		}
		
		for (int i = 0; i < options.size(); i++) {
			select.deselectByIndex(i);//deselect by simple loop and index
			Thread.sleep(1000);
		}
		
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		select.deselectAll();//for deselect allselected option
		
		
		driver.close();
	}

}
