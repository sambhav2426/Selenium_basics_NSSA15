package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to take screenshot of entire webpage with unique name ie date and time
public class Tester56 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		LocalDateTime ldt = LocalDateTime.now();//in date and time colon not allowed 
		String s1 = ldt.toString().replace(":", "-");//replace colon to hyphen
		//if not replace then throw io exception
		
		TakesScreenshot ts=(TakesScreenshot)driver;//downcast bcuz direct can't access
		File srcFile = ts.getScreenshotAs(OutputType.FILE);//take the ss
		
		File destFile=new File("./errorshots/"+s1+".png");//store in date and time format
		
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("Screenshot taken");
		
		driver.close();
	}

}
