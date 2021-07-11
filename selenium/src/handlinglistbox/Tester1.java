package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS to select the option by using different selection methods from select class on sample html
public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/index3.html");//developed html file
		
		WebElement java = driver.findElement(By.id("Java"));//pass the ref var 
		
		Select select=new Select(java);//select class const ask for element
		
		//====1st method====
		select.selectByIndex(1);//select by index no []
		Thread.sleep(4000);     //default selected value is 'Variable'
		
		//====2nd method=====
		select.selectByValue("c");//pass value=attValue in string format
		Thread.sleep(4000);
		
		//====3rd method====
		select.selectByVisibleText("Inheritance");//pass the entire text
		Thread.sleep(5000);
		
		driver.close();
	}

}
 