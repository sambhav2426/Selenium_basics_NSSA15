package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester4 {
	
	@Test(priority = 4)
	public void cat() {
		Reporter.log("This is cat method", true);
	}
	
	@Test (priority = 1)
	public void lion() {
		Reporter.log("This is lion method", true);
	}
	
	@Test(priority = 2)
	public void cheetah() {
		Reporter.log("This is cheetah method", true);
	}
	
	@Test(priority = 3)
	public void Dog() {
		Reporter.log("This is Dog method", true);
	}
	
	@Test
	public void jaguar() {
		Reporter.log("This is jaguar method", true);//If priority not mention then that will execute first
	}
}
