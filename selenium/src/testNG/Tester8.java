package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tester8 {

	@BeforeMethod(alwaysRun = true) //to run always with groups
	public void Login() {
		Reporter.log("This is Login method", true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void Logout() {
		Reporter.log("This is Logout method", true);
	}
	
	@Test(groups = {"smoke"})
	public void createUser() {
		Reporter.log("This is create User method", true);
	}
	
	@Test(groups = {"regression","smoke"})
	public void deleteUser() {
		Reporter.log("This is delete User method", true);
	}
	
	@Test(groups = {"smoke"})
	public void createCustomer() {
		Reporter.log("This is create Customer method", true);
	}
	
	@Test(groups = {"regression"})
	public void deleteCustomer() {
		Reporter.log("This is delete customer", true);
	}
}
