package basics;

import org.openqa.selenium.chrome.ChromeDriver;
//Write a script to launch the empty Chrome Browser  
public class Tester1 {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); //object creation
		driver.manage().window().maximize();
	}

}
