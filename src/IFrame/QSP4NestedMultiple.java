package IFrame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSP4NestedMultiple {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected = "https://demoapps.qspiders.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");

		String actual = driver.getCurrentUrl();
		if(expected.equals(actual)) {
			System.out.println("I am in QSPIDER ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[@class='block w-[100%] h-full'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/li[6]/section[1]")).click();
			driver.findElement(By.linkText("iframes")).click();
			driver.findElement(By.linkText("Nested with Multiple iframe")).click();
			Thread.sleep(2000);
			
			//Switch to 3rd iFrame by using WebElement
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
			driver.switchTo().frame(0);
			driver.switchTo().frame(0);
			
			driver.findElement(By.id("email")).sendKeys("Admin24@gmail.com");
			
			//Switch to 4th iFrame by using WebElement
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
			driver.switchTo().frame(0);
			driver.switchTo().frame(1);
			driver.findElement(By.id("password")).sendKeys("Admin@123");
			
			//Switch to 5th iFrame by using WebElement
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
			driver.switchTo().frame(0);
			driver.switchTo().frame(2);
			driver.findElement(By.id("confirm")).sendKeys("Admin@123");
			
			//Switch to 6th iFrame by using WebElement
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
			driver.switchTo().frame(0);
			driver.switchTo().frame(3);
			driver.findElement(By.id("submitButton")).click();
	}
	}
}
