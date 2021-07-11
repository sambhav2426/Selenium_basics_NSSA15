package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate activeElement on demo.actitime app
public class Tester28 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.switchTo().activeElement().sendKeys("Qspider");//address of currently element in focus
		//swtch to activeElement which return type is webElement
		Thread.sleep(5000);//delay
		driver.close();

	}

}
