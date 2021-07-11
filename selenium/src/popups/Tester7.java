package popups;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to select next  year's date in calender popup (hardcoded) 
public class Tester7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("DepartDate")).click();
		
		out ://need reference for coming out from outer loop
			for(;;) { //infinite loop 
				
				driver.findElement(By.xpath("//a[@class=\"nextMonth \"]")).click();
				
				List<WebElement> months = driver.findElement(By.id("ui-datepicker-div")).findElements(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
										 //parent element                                     //child element
				List<WebElement> years = driver.findElement(By.id("ui-datepicker-div")).findElements(By.xpath("//span[@class=\"ui-datepicker-year\"]"));
				
				for (WebElement month : months) {
					if (month.getText().equals("May")) {
						for (WebElement year : years) {
							if (year.getText().equals("2022")) {
								break out;//control will come out of all the loop , refernce is used in nested loop(infinite loop)
							}
						}
						
					}
				}
			}
		driver.findElement(By.xpath("//span[text()=\"April\"]/../../..//a[text()=\"24\"]")).click();//hardcoded value
		
		Thread.sleep(4000);
		driver.close();
			
	}

}
