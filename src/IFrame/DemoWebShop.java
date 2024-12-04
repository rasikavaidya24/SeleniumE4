//write script for iframe page

//1)open the browser
//2)maximize
//3)enter into dws page
//4)verify the page by using webelement
//5)click facebook link which is present at the bottom
//6)click create new account which i present in fb page
//7)send some values inside the dws search field
//8)click the google

package IFrame;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/RASIKA/Documents/Jira%20Software_%20Latest%20Version%20_%20Atlassian_files/Downloads/iframe.html");
		driver.switchTo().frame("FR1");
		String parent = driver.getWindowHandle();
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));

		if(poll.isDisplayed()) {
			System.out.println("In Dws Web Page");
			Actions act = new Actions(driver);
			act.keyDown(Keys.DOWN).perform();
			act.keyDown(Keys.DOWN).perform();
			act.keyDown(Keys.DOWN).perform();
			WebElement fb = driver.findElement(By.xpath("//a[text()='Facebook']"));
			fb.click();
			Set<String> child = driver.getWindowHandles();
			child.remove(parent);
			for (String string : child) {
				driver.switchTo().window(string);
			}
			System.out.println(child);
			
			driver.findElement(By.xpath("//div[@aria-label='Create new account']")).click();
            //driver.close();
			driver.switchTo().window(parent);
			driver.switchTo().frame("FR1");
				act.keyDown(Keys.UP).perform();
				act.keyDown(Keys.UP).perform();
				act.keyDown(Keys.UP).perform();
				Thread.sleep(2000);
				WebElement search = driver.findElement(By.id("small-searchterms"));
				search.sendKeys("Book");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.partialLinkText("Google")).click();
		}
		else {
			System.out.println("Not in Dws page");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}


	

