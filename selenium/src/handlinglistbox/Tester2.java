package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS to select all the options one by one using select class methods for sample html
public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/index3.html");
		
		WebElement java = driver.findElement(By.id("Java"));
		
		Select select=new Select(java);
		List<WebElement> options = select.getOptions();//list of getOption
		
		//====1st method====
		for (int i = 0; i < options.size(); i++) { //by using simple for loop where options.size() used
			select.selectByIndex(i);//select option by index
			Thread.sleep(2000);
		}
		
		//====2nd method====
		for (WebElement option : options) {
			select.selectByValue(option.getAttribute("value"));//select option by getAttr() which will get value and select accordingly
			Thread.sleep(2000);
		}
		
		//====3rd method====
		for (WebElement option : options) {
			select.selectByVisibleText(option.getText());//select option by getText() 
			Thread.sleep(2000);
		}
		
		
		driver.close();
	}

}