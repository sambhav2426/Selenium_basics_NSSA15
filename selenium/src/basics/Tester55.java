package basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to take scrrenshot of entire webpage
public class Tester55 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;//downcast bcuz direct can't access from remoteWebdriver
		File srcFile = ts.getScreenshotAs(OutputType.FILE);//take the ss
		
		File destFile=new File("./errorshots/error1.png");//override or replace old error image
		
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("Screenshot taken");
		
		driver.close();
	}

}
