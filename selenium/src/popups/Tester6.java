package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to select next months and date in calender popup (generic)
public class Tester6 {

	public static void main(String[] args) throws InterruptedException {

		LocalDateTime ldt = LocalDateTime.now().plusMonths(1).plusDays(5);

		int date = ldt.getDayOfMonth();
		String dayofmonth = Integer.toString(date);//convert int to string that is wrapper integer into string
		
		String month = ldt.getMonth().name();//need to convert into string so that string class method can use
		month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.cleartrip.com/flights");

		driver.findElement(By.id("DepartDate")).click();

		driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//a[text()='"+dayofmonth+"']")).click();
		// dynamic xpath which will change according to system date that is called generic means any date
		
		Thread.sleep(3000);
		driver.close();
	}

}
