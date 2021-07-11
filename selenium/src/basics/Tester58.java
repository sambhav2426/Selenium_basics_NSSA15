package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to take a screenshot of a specific webElement
public class Tester58 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/");
		
		WebElement searchTextField = driver.findElement(By.id("4"));
		File srcFile = searchTextField.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("./errorshots/error2.png");
		
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("screenshotTaken");
		
		driver.close();
	}
}
