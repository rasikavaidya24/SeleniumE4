package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskOnCalendarPopUp {

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
		driver.findElement(By.xpath("//div[@id='dvfarecal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("25/09/2024")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("rdatelbl")).click();
		Thread.sleep(3000);
		for(;;) {
			try {
				driver.findElement(By.id("frth_6_25/01/2025")).click();
        break;
			}
		catch(Exception e) {
			driver.findElement(By.id("img2Nex")).click();
			Thread.sleep(1000);
		}
		}


		
	}

}
