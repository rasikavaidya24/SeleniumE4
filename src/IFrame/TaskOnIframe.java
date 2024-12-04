//write script for iframe page
//1)open the browser
//2)maximize
//3)enter into
//4)verify the page by using webelement
//5)send some values inside the dws search field
//6)search the product
//7)click  the google link
//8)close the browser
package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOnIframe {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
        ChromeDriver driver=new ChromeDriver();
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		Thread.sleep(2000);
		driver.get("file:///C:/Users/RASIKA/Documents/Jira%20Software_%20Latest%20Version%20_%20Atlassian_files/Downloads/iframe.html");	
		Thread.sleep(3000);
		//String actual_result=driver.getTitle();
		//if(expected_result.equals(actual_result))
		//{
			//System.out.println("i am in dws homepage");
		WebElement search = driver.findElement(By.id("small-searchterms"));

			search.sendKeys("Book");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.partialLinkText("Google")).click();
		//}
		//else {
			//System.out.println("Not in Dws page");
		//}
		Thread.sleep(3000);
		driver.quit();


		
	}

}
