package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to handle file upload popup in naukri.com which doesn't have an input tag for upload button
public class Tester15 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("wdgt-file-upload")).click();//it doesn't have input tag then use autoIt
		
		Runtime run=Runtime.getRuntime();//runtime class has static method getRuntime
		run.exec("D:\\Selenium\\AutoIt.exe");//throw IO exception
		//after compile autoIt script give autoit .executable file in this runclass
		
		Thread.sleep(18000);//for delay
		driver.quit();
		
	}

}