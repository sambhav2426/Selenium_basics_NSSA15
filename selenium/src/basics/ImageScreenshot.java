package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to take ss on particular image 
public class ImageScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LocalDateTime ldt=LocalDateTime.now();
		String s1 = ldt.toString().replace(":", "-");
		
		driver.get("https://in.bookmyshow.com/explore/home/mummidivaram");
		
		WebElement image = driver.findElement(By.xpath("//img[@class=\"style__Image-eykeme-1 dkwyqp\" ] "));
		//find element will take first matching element
		
		File srcFile = image.getScreenshotAs(OutputType.FILE);
		File destFile= new File("./errorshots/error101.png");
		FileUtils.copyFile(srcFile, destFile);
		
		WebElement image2 = driver.findElement(By.xpath("(//img[@class=\"style__Image-eykeme-1 dkwyqp\" ]) [4]"));
		//xpath by index for particular image //this image override previous elemnts
		
		File srcFile1 = image2.getScreenshotAs(OutputType.FILE); 
		File destFile1 = new File("./errorshots/"+s1+".png"); 
		FileUtils.copyFile(srcFile1, destFile1);//FileUtil is external library
		
		driver.get("https://web.whatsapp.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		ts.getScreenshotAs(OutputType.FILE);
		new File("D:/SeleniumErrorshot/error1.png");//File in D drive 
		//FileUtils.copyDirectory(srcFile2, destFile2);
		 
		driver.close();
		
	}

}
