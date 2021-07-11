package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to perform horizontal scrolling using javascript executor()
public class Tester62 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		Dimension dim = new Dimension(500, 400);
		driver.manage().window().setSize(dim);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500,0);");//+x scroll towards right side
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(-500,0);");//-x scroll towards left side
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
