package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");//navigate to URL
		

		Dimension dim=new Dimension(500, 500);//object creation for dimension(unit in pixel)
		driver.manage().window().setSize(dim);// browser size
		Thread.sleep(3000); //wait for 3seconds
		
		//Point pt =new Point(1300, 800); //object creation for point(co-ordinate)
		driver.manage().window().setPosition(new Point(200, 800));//set position of browser in window (x,y coordination)


	}

}
