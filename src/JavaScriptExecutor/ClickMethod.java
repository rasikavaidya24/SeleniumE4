package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://www.redbus.in/");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement jdk = driver.findElement(By.linkText("jdk-8u421-linux-x64.rpm"));
	    js.executeScript("arguments[0].scrollIntoView(false)", jdk);
	    Thread.sleep(2000);
	    jdk.click();
	    Thread.sleep(2000);
	    WebElement disable_button = driver.findElement(By.linkText("Download jdk-8u421-linux-x64.rpm"));
	    Thread.sleep(2000);
	    js.executeScript("arguments[0].click();", disable_button);


	}
	   

}
