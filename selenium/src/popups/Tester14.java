package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to handle file upload popup in naukri.com which has an input tag for upload button
public class Tester14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		String parentwindow = driver.getWindowHandle();
		driver.switchTo().window(parentwindow);
		//it has input tag so directly we can upload by using path
		driver.findElement(By.id("file_upload")).sendKeys("C:\\Users\\SEEMA KUMARI\\OneDrive\\Desktop\\New Resume.docx");
		Thread.sleep(5000);
		driver.quit();
	}

}
