package popups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to select today's date in calender popup in cleartrip.com (hardcoded)
public class Tester5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//span[text()='May']/../../..//a[text()='24']")).click();//the value is for fixed date that is called hardcoded
		
		Thread.sleep(2000);
		driver.close();
	}

}
