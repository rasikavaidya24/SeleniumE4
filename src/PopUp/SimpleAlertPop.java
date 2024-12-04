package PopUp;
import org.openqa.selenium.By;
import UtilityClass.CrossBrowserTesting;

public class SimpleAlertPop extends CrossBrowserTesting
{
	public static void main(String[] args) throws InterruptedException 
	{
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		preCondition("chrome");
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}
}
