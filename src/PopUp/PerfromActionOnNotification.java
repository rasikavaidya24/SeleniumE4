package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerfromActionOnNotification {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//open the browser
        ChromeDriver driver=new ChromeDriver();
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		Thread.sleep(2000);
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=Cj0KCQjwi5q3BhCiARIsAJCfuZlagA4g0K1GOWMZ8mmDKwxx8ZvS8qbogkIhuCym-CPvt9xoyWntxkMaAoEWEALw_wcB");
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
