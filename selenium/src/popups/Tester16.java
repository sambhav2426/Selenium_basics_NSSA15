package popups;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//WAS to handle notification popup in chromebrowser
public class Tester16 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");//this args present in chromium command line switches
		WebDriver driver=new ChromeDriver(options);//pass the ref obj then only it'll disable 
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/");
	}

}
