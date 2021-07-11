package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester1 {
	
	@Test     //replace with main method bcuz we can overload with same args
	public void m1() {
		Reporter.log("This is  m1 method", true);//print the msg
	}
	
	@Test
	public void m2() {
		Reporter.log("This is m2 method", true); //true- boolean value which print on console also
	}
}
