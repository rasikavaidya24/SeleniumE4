package IFrame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected = "https://demoapps.qspiders.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);

		String actual = driver.getCurrentUrl();
		if(expected.equals(actual)) 
		{
			System.out.println("I am in QSPIDER ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[@class='block w-[100%] h-full'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/li[6]/section[1]")).click();
			driver.findElement(By.linkText("iframes")).click();
			driver.findElement(By.linkText("Nested iframe")).click();
			Thread.sleep(2000);

			//Switch to iFrame by using WebElement
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
			driver.switchTo().frame(0);
			driver.findElement(By.id("email")).sendKeys("Admin24@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Admin@123");
			driver.findElement(By.id("confirm-password")).sendKeys("Admin@123");
			driver.findElement(By.id("submitButton")).click();	
		}
	}
}
