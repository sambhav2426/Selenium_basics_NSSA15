package basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester54 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);//take the SS
		
		File destFile=new File("./error1.png");//store the Screenshot
		
		FileUtils.copyFile(srcFile, destFile);//copy ss from source file to destination file
		
		driver.close();
	}

}
