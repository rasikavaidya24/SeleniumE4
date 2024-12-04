package PopUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import UtilityClass.CrossBrowserTesting;

public class SimpleAlert2 extends CrossBrowserTesting
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("chrome");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
	}
}
