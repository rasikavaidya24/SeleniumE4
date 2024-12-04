package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		 WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
       //enter into Web page
		driver.get("file:///C:/Users/RASIKA/Documents/Jira%20Software_%20Latest%20Version%20_%20Atlassian_files/Downloads/demo.html");
		WebElement single_select=driver.findElement(By.id("standard_cars"));
		Thread.sleep(3000);
        Select sel=new Select(single_select);
        sel.selectByVisibleText("Land Rover");
		Thread.sleep(3000);
		sel.selectByValue("merc");
		Thread.sleep(3000);
        sel.selectByIndex(3);
		

	}

}
