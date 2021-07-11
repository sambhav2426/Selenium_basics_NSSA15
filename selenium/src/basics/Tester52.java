package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to get the count of links and get the text of each link from amazon.in appln		
public class Tester52 {
		
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Count of links"+links);
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		driver.close();
	}

}
