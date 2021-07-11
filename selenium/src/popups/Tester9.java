package popups;

import java.awt.AWTException;
import java.awt.Robot;

public class Tester9 {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
		Robot robot=new Robot(); // AWT exception
		Thread.sleep(4000);
		robot.mouseMove(500, 500);//mouse hover but actual mouse move that is native OS system
	}

}
