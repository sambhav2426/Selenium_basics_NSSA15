package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS as an experiment to validate autosuggestions
public class AutoSuggestion {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("edible");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class=\"s-suggestion\"]"));
		
		System.out.println("No of suggestions : "+suggestions.size()+"\n");//No. of suggestion
		
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());//suggestion list
		}
		
		suggestions.get(2).click();//click on index[2] suggestion
		
		driver.close();
	}

}
