package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=loginBtn']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=loginBtn']")));
		driver.findElement(By.xpath("//button[@id=loginBtn']")).click();
        driver.findElement(By.xpath("//span[text()='Create Account']")).click();

		
		
	}

}
