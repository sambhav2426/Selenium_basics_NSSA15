package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester3 {
	
	@Test(priority = 1)
	public void lion() {
		Reporter.log("This is lion method", true);
	}
	
	@Test(priority = 4)
	public void cat() {
		Reporter.log("This is cat method", true);
	}
	
	@Test(priority = 3)
	public void Dog() {
		Reporter.log("This is Dog method", true);
	}
	
	@Test(priority = 2)
	public void cheetah() {
		Reporter.log("This is cheetah mthod", true);//If same priority then bydefault follow alphabetical order based on ASCII
	}
	
	@Test(priority = 2)
	public void jaguar() {
		Reporter.log("This is jaguar method", true);
	}
}
