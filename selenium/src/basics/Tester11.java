package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester11 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();//maximize
	
	driver.get("https://www.google.com/");//launch app
	
	Dimension dim=new Dimension(400, 600);//browser size given (unit is pixel)

	driver.manage().window().setSize(dim);//browser size
	
	}

}
