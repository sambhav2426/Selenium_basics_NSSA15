package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester6 {

	@Test(enabled = true) //if it will disable then other dependent methods will not work
	public void Login() {
		Reporter.log("This is login method", true);
	}
	
	@Test(dependsOnMethods = "Login")
	public void createMethod() {
		Reporter.log("This is create method", true);
	}
	
	@Test(dependsOnMethods = {"createMethod"})
	public void deleteMethod() {
		Reporter.log("This is delete method", true);
	}

}