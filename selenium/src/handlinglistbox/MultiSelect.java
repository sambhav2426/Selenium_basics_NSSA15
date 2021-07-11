package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Assignment WAS to perform End-end testing & select and deselect option without using select class method
public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);//switch control to parent window
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("sima13570@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys("sima13570");
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
		
		driver.findElement(By.xpath("//div[text()=\"UPDATE PROFILE\"]")).click();
		
		WebElement editCareerProfile = driver.findElement(By.xpath("(//span[text()='Career Profile'])[2]/..//span[text()='Edit']"));
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", editCareerProfile);
		editCareerProfile.click();
		Thread.sleep(2000);
		WebElement locationSugg = driver.findElement(By.id("locationSugg"));
		locationSugg.click();
		List<WebElement> locations = driver.findElements(By.xpath("//li[@class=\"sugTouple UnChecked\"]"));
		
		for (WebElement location : locations) {
			location.click();//select option
			Thread.sleep(2000);
			location.click(); //deselect option
			
		}
		
		driver.findElement(By.linkText("CANCEL")).click();
		Thread.sleep(2000);
		WebElement myNaukri = driver.findElement(By.xpath("//div[text()='My Naukri']"));
		
		js.executeScript("arguments[0].scrollIntoView();", myNaukri);//scroll it to elemnt otherwise throw error directly can't move there
		Actions actions=new Actions(driver);
		actions.moveToElement(myNaukri); //mouse hover for logout
		actions.perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}

}
