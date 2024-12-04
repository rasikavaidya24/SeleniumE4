package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBasedOnWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://www.redbus.in/");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement book_train = driver.findElement(By.linkText("Book Train Tickets"));
	    js.executeScript("arguments[0].scrollIntoView(true)", book_train);
	    
	    

	}

}
