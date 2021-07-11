package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate submit button working on Facebook app
public class Tester25 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("login")).submit();//submit button work
		//1 and 3 condn follow 
		Thread.sleep(10000);//delay
		driver.close();
	}

}
