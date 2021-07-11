package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS to select and deselect all the options one by one using select class method
public class Tester6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///D:/Selenium/index3.html");

		WebElement manual = driver.findElement(By.id("Manual"));
		Select select = new Select(manual);
		List<WebElement> options = select.getOptions();//to getOption which is present in listbox

		for (WebElement option : options) {
			select.selectByValue(option.getAttribute("value"));//select each option
			Thread.sleep(2000);
		}
		
		List<WebElement> selectedOption = select.getAllSelectedOptions();
		for (WebElement option : selectedOption) {
			System.out.println(option.getText());//to print selected option 
		}


		for (WebElement option : options) {
			select.deselectByValue(option.getAttribute("value"));//deselect option
			Thread.sleep(2000);
		}

		driver.close();
	}

}
