//write a script for the dws page 
//1)open the browser
//2)maximize
//3)enter into news
//4) Verify the page by using the URL
//5)you need to click all 5 links Twitter, FB, YouTube, google
//6) Perform in any single action
//5) Read all the text from RSS 
0
package ChildClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		String demo_givenUrl="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String actualResult=driver.getCurrentUrl();
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).click().build().perform();
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='column follow-us]/ul/li/a"));
		for(WebElement web : links)
		{
		String facebookUrl="https://www.facebook.com/nopCommerce";
		String twitterUrl="https://x.com/nopCommerce";
		String googleUrl="https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		String youtubeUrl="https://www.youtube.com/user/nopCommerce";
		String rssUrl="https://demowebshop.tricentis.com/news/rss/1";
		
		Set<String> childUrl = driver.getWindowHandles();		
		for(String str : childUrl)
		{
			driver.switchTo().window(str);
			if(facebookUrl.equals(childUrl))
			{
				driver.findElement(By.name("email")).sendKeys("rasikavaidya24@gmail.com");
			}
			else if(twitterUrl.equals(childUrl))
			{
				driver.findElement(By.name("email")).sendKeys("rasikavaidya24@gmail.com");
			}
			
		 }

		 }
		
	}
}


