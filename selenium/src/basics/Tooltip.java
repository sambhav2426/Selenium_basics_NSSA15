package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/hand-wash/pr?sid=g9b,ema,rhm,irj&marketplace=FLIPKART&p[]");
		
		String expectedTooltip = "santoor Gentle Wash Classic Sandalwood and Tulsi Handwash Hand Wash Pouch";
		String actualTooltip = driver.findElement(By.linkText("santoor Gentle Wash Classic Sandalwood and Tulsi Handwa...")).getAttribute("title");
		
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test case is failed");

		}
		driver.close();
	}

}
