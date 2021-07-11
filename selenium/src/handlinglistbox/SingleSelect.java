package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WAS as assignment to single select listbox i.e DOB by using select class
public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay=new Select(day);
		selectDay.selectByIndex(23);
		Thread.sleep(2000);           //by default Current Date selected
		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth=new Select(month);
		selectMonth.selectByValue("4");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear=new Select(year);
		selectYear.selectByVisibleText("1998");
		
		System.out.println(selectDay.getFirstSelectedOption().getText()+" "+selectMonth.getFirstSelectedOption().getText()+" "+selectYear.getFirstSelectedOption().getText());
		
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
