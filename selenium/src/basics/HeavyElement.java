package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS as an experiment to locate childElement through parentElement
public class HeavyElement {
	
	public static void main(String[] args) { 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://in.bookmyshow.com/explore/home/mummidivaram");
		WebElement parent = driver.findElement(By.xpath("//div[@class=\"style__WidgetContainerWrapper-lnhrs7-1 gxrBdz\"]"));
		List<WebElement> contents = parent.findElements(By.tagName("img"));
		
		System.out.println(contents.size());
		
		driver.close();
		
	}
}	