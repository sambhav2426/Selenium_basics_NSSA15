package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS as experiment to validate whether Buy Now button  is enabled or disabled
public class ButtonEnable {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/dp/B082WKNS2L/ref=s9_acsd_al_bw_c2_x_5_i?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-2&pf_rd_r=TDNSZBM2J3JXXTMATQP6&pf_rd_t=101&pf_rd_p=34ab24fe-66d9-4a4c-9fd2-cd69a355d87e&pf_rd_i=13993588031");
		String value = driver.findElement(By.id("add-to-cart-button")).getAttribute("class");
		
		if (value.contains("disabled") || value.contains("gray")){
			System.out.println("Button is disabled");
		}else {
			System.out.println("Button is enabled");
		}
		
		driver.close();
	}
}
