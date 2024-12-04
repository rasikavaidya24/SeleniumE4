package PopUp;
import org.openqa.selenium.By;

import UtilityClass.CrossBrowserTesting;

public class SmpleAlertPopVerification extends CrossBrowserTesting
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("chrome");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert();
		Thread.sleep(2000);
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),\\\"Books\\\")]")).click();
			System.out.println("PopUp is not Displayed.....!!!!!");
		}
		catch (Exception e)
		{
			System.out.println("PopUp is displayed........!!!!!!!!");
		}
	}
}



