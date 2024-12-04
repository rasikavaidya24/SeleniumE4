package PopUp;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.CrossBrowserTesting;

public class GetHandels extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		String expected = "https://demowebshop.tricentis.com/news/rss/1";
		preCondition("chrome");
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		for (WebElement web : links) {
			web.click();
			String actual = driver.getCurrentUrl();
			Thread.sleep(2000);
			if(expected.equals(actual)) {
				driver.navigate().back();
			}
			Thread.sleep(2000);
		}
		Thread.sleep(3000);
		Set<String> childs = driver.getWindowHandles();
		
		System.out.println(childs);
		postCondition("quit");
	}

}

