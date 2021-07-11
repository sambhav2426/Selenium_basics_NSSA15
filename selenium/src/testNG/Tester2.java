package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester2 {
	
	@Test
	public void cat() {
		Reporter.log("This is cat method", true);//bydefault alphabetical order based on ASCII value
	}
	
	@Test
	public void Dog() {
		Reporter.log("This is Dog method", true);
	}
	
	@Test 
	public void cheetah() {
		Reporter.log("This is cheetah method", true);
	}
	
	@Test
	public void  lion() {
		Reporter.log("This is lion method", true);
	}
}	

