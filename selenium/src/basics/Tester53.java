package basics;
 
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to handle autosuggestions and print it on console and click on autosuggestion in google appln
public class Tester53 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//li[@class=\"sbct\"  and not(@id='YMXe')]"));
		//create xpath for those element which is autosuggestion on google and remove extra element by using NOT operator
		System.out.println("No of suggestion "+autosuggestions.size());
		for (WebElement autosuggestion : autosuggestions) {
			System.out.println(autosuggestion.getText());
		}
		
		autosuggestions.get(1).click();//get particular index to click
		Thread.sleep(5000);
		
		driver.close();
	}

}
