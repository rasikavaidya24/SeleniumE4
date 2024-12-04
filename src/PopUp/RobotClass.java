package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//open the browser
        ChromeDriver driver=new ChromeDriver();
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_K);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//release the key
	    r.keyRelease(KeyEvent.VK_R);
	    r.keyRelease(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_S);
	    r.keyRelease(KeyEvent.VK_I);
	    r.keyRelease(KeyEvent.VK_K);
	    r.keyRelease(KeyEvent.VK_A);

	    r.keyRelease(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_ENTER);
		//driver.close();


	}

}
