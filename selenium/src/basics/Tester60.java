package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to write on the Web Console of a browser
public class Tester60 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("console.log('Hello Guys')");//give as input on console
		
		
		
		int a=2020;//pass value to javascript code with the help of var called as arguments
		int b=2021;//use as a argument
		js.executeScript("console.log(arguments[0])",a);//a obj argument pass to javascript code and to print on console, use console.log
		js.executeScript("console.log(arguments[0]);"+"console.log(arguments[1])", a,b);
		//a and b argument pass to the javascript code and print on the console  
		
		//Obj arg work as var...args means mutiple parameter can give
		//obj args give i/p to javascript code
		//console.log for print input to webconsole
	}

}
