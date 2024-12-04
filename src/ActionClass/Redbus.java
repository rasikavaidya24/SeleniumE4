			
package ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException, AWTException {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.get("https://www.redbus.in/");
	Thread.sleep(3000);
    Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	//release the key
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//driver.close();
	
    
	}

}
