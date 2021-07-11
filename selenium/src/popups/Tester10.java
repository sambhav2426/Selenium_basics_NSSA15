package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Tester10 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.mouseMove(20, 400);//first cursor move 
		robot.mousePress(KeyEvent.BUTTON3_DOWN_MASK);  //press right click
		robot.mouseRelease(KeyEvent.BUTTON3_DOWN_MASK);//release right click
		
	}

}
