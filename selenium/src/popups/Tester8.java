package popups;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to select next year's date in calendar popup (generic)
public class Tester8 {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDateTime ldt=LocalDateTime.now().plusYears(1).minusMonths(1);//adding year,month, date in the system date and get next year date
		int date = ldt.getDayOfMonth();
		String dayofMonth = Integer.toString(date);
		
		String month = ldt.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1).toLowerCase();
		
		int year1 = ldt.getYear();
		String year = Integer.toString(year1);//convert int to string by wrapper class obj
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/flights");
		
		driver.findElement(By.id("DepartDate")).click();
		
		outer : //use reference for coming out from entire loop otherwise infinite loop not break 
			for(;;) {
				
				driver.findElement(By.xpath("//a[@class=\"nextMonth \"]")).click();
				
				List<WebElement> months = driver.findElement(By.id("ui-datepicker-div")).findElements(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
				
				List<WebElement> years = driver.findElement(By.id("ui-datepicker-div")).findElements(By.xpath("//span[@class=\"ui-datepicker-year\"]"));
				
				for (WebElement month1 : months) {
					if (month1.getText().equals(month)) {//dynamically month select
						for (WebElement year2 : years) {
							if (year2.getText().equals(year)) {//dynamically year select
								break outer;//use ref so control go out from entire loop 
							}               //if ref not use with break then only internal loop will break not outer
						}
					}
				}
			}
		driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//a[text()='"+dayofMonth+"']")).click();//dynamic xpath()
		
		Thread.sleep(5000);
		driver.close();
	}

}
