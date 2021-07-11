package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to take a screenshot of specific webElement using unique name ie date and time
public class Tester57 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximixe window
		
		LocalDateTime ldt = LocalDateTime.now();//in date and time colon not allowed 
		String s1 = ldt.toString().replace(":", "-");//replace colon to hyphen
		//if not replace then throw io exception
		
		driver.get("https://demo.actitime.com/login.do");//launch app
		WebElement username = driver.findElement(By.id("username"));//inspect unique element
		File srcFile = username.getScreenshotAs(OutputType.FILE);//take the screenshot
		
		File destFile=new File("./errorshots/"+s1+".png");//store screenshot in date and time format
		
		FileUtils.copyFile(srcFile, destFile);//copy screenshot from src to dest file
		System.out.println("Screenshot taken");
		
		driver.close();
	}

}
