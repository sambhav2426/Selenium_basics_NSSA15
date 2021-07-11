package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate the height and width of Username textfield in demo.actitime.com
public class Tester44 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
	
		Dimension dim = username.getSize(); //get Dimension
		int height = dim.getHeight();//get height
		int width = dim.getWidth();//get width
		
		System.out.println("Dimension of UN is "+dim);//(214, 32)
		
		System.out.println("Height of username textfield : "+height);
		System.out.println("Width of username textfield : "+width);
		
		driver.close();
	}

}
