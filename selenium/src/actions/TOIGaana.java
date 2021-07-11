package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//WAS to click on Gaana's play button on Times of India app
public class TOIGaana {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("---disable-notifications");

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://timesofindia.indiatimes.com/");
		Thread.sleep(3000);

		WebElement frame = driver.findElement(By.xpath("(//iframe[@loading=\"lazy\"])"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", frame);
	
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//a[@title=\"Play\"]")).click();
		Thread.sleep(8000);
		driver.close();

	}

}
