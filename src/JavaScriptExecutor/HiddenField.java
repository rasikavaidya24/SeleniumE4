package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenField {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://www.facebook.com/");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement chupaav = driver.findElement(By.linkText("Create new account"));
	    js.executeScript("arguments[0].scrollIntoView(false)",chupaav);
	    Thread.sleep(2000);
	    WebElement disable_button = driver.findElement(By.id("custom_gender_container"));
	    Thread.sleep(2000);
	    js.executeScript("arguments[0].value='hua'",chupaav);


}
}