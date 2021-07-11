package handlinglistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS to validate whether a listbox is a single-select or multi-select
public class Tester4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Selenium/index3.html");
		
		WebElement manual = driver.findElement(By.id("manual"));
		
		Select select=new Select(manual);
		
		if (select.isMultiple()) {//to check whether multiple select or not
			System.out.println("The listBox is multi-slect listbox");
		}else {
			System.out.println("The listBox is single-slect listbox");
		}

		driver.close();
	}

}
