package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.get("https://www.redbus.in/");
    Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
     //js.executeScript("window.scrolllBy(0,500)");
     //Thread.sleep(2000);
     //js.executeScript("window.scrolllBy(0,1500)");
//     Thread.sleep(3000);
//     js.executeScript("window.scrolllTo(0,1500)");
//     Thread.sleep(3000);
//     js.executeScript("window.scrolllTo(0,-1500)");



    
    
    
	}

}
