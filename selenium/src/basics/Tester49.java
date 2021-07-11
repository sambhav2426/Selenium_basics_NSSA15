package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate whether flipkart logo is an image or not
public class Tester49 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		String expectedTagname = "img";
		String actualTagname = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]")).getTagName();
		
		if (actualTagname.equals(expectedTagname)) {
			System.out.println("Flipkart logo is an image");
		}else {
			System.out.println("Flipkart logo is not image");

		}
		
		driver.close();
	}

}
