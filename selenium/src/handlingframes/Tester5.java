package handlingframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to transfer control from a frame to default frame using different methods in sample code
public class Tester5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium/index2.html");
		
		driver.switchTo().frame(0);//switch to frame by index, value[0]
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("QSP");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();//switch to default webpage
		driver.findElement(By.id("user")).sendKeys("111");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame");//switch to frame by string, name=frame
		driver.findElement(By.id("username")).sendKeys(" Noida");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();//switch to default webpage
		driver.findElement(By.id("user")).sendKeys(" 222");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frameid");//switch to frame by string, id=frameid
		driver.findElement(By.id("username")).sendKeys(" Sector 3-A29");//it take time bcuz first priority give to name then id
		Thread.sleep(2000);
		
		driver.navigate().refresh();//refresh to default webpage
		//without using defaultContent() and parentFrame()
		Thread.sleep(2000);
		driver.findElement(By.id("user")).sendKeys("333");
		Thread.sleep(3000);
		
		driver.close();
	}

}
