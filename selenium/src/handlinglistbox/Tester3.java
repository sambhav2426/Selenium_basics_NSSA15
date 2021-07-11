package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WAS to print all the options and get the first selected option in sample html
public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///D:/Selenium/index3.html");

		WebElement java = driver.findElement(By.id("Java"));

		Select select = new Select(java); //create obj & pass ref var to select class const
		List<WebElement> options = select.getOptions();
		
		WebElement defaultOption = select.getFirstSelectedOption();
		System.out.println("byDefault selected: "+defaultOption.getText()+"\n");//to print default selected option
		
		for (WebElement option : options) {//use any select class method (ByIndex, ByValue, ByVisibleText)
			select.selectByVisibleText(option.getText());//select all option one by one by using select class 
			Thread.sleep(2000);
		}
		
		for (WebElement option : options) {
			System.out.println(option.getText());//to print all option from list box
		}
		
		WebElement selectOption = select.getFirstSelectedOption();
		System.out.println("\nLatest selected:"+selectOption.getText());//to print latest selected option
		
		driver.close();
	}

}
