package Backup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectThevalue {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser----------
	driver.manage().window().maximize();
	//waiting condition
	Thread.sleep(2000);
	//enter into url
	driver.get("file:///C:/Users/RASIKA/Documents/Jira%20Software_%20Latest%20Version%20_%20Atlassian_files/Downloads/demo.html");
	Thread.sleep(3000);
	WebElement single_select = driver.findElement(By.id("standard_cars"));
	Select sel=new Select(single_select);
	sel.selectByValue("lr");
	Thread.sleep(2000);
	sel.selectByVisibleText("Mercedes");
	Thread.sleep(2000);
	sel.selectByIndex(5);
	WebElement multi_select=driver.findElement(By.id("multiple_cars"));
	Select sel=new Select(multi_select);
	Thread.sleep(2000);
	sel.selectByVisibleText("Volvo");
	Thread.sleep(2000);
	sel.selectByVisibleText("BMW");
	Thread.sleep(2000);






}
}
