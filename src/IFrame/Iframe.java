package IFrame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://www.dream11.com/");
    Thread.sleep(2000);
    //switch conroller to iframe
    driver.switchTo().frame(0);
    WebElement ph_number = driver.findElement(By.id("regEmail"));
    Thread.sleep(3000);
    ph_number.sendKeys("9876567452");
    Thread.sleep(3000);
    driver.switchTo().defaultContent();
    //driver.switchTo().parentFrame();
    driver.findElement(By.id("hamburger")).click();
    
    
	}

}




