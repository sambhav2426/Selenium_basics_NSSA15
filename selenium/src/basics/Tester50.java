package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to validate whether Buy Now button is banggood.in  is enabled or disabled
public class Tester50 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.banggood.in/Wltoys-K989-1-or-28-2_4G-4WD-Alloy-Chassis-Brushed-RC-Car-Vehicles-RTR-Model-p-980187.html?rmmds=flashdeals&cur_warehouse=CN");
		String value = driver.findElement(By.linkText("Buy Now")).getAttribute("class");
		
		if (value.contains("disabled") || value.contains("gray")){
			System.out.println("Button is disabled");
		}else {
			System.out.println("Button is enabled");
		}
		
		driver.close();
	}
}
