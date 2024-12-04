package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleClickInCalendar {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		//open the browser
        ChromeDriver driver=new ChromeDriver(options);
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		Thread.sleep(2000);
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='dvfarecal]'")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("20/09/2024")).click();
		Thread.sleep(2000);
        driver.findElement(By.id("rdatelbl")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("30/09/2024")).click();

		
	}

}
