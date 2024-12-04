package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AJIO {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_result="https://www.ajio.com/";

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(expected_result);
		Thread.sleep(2000);																																																	

		String actual_result=driver.getCurrentUrl();
		if (actual_result.equals(expected_result)) {
		System.out.println("we are on ajio home page");
		driver.findElement(By.name("searchVal")).sendKeys("watch");
		driver.findElement(By.className("ic-search")).click();
		String price = driver.findElement(By.xpath("//strong[contains(text(),'₹')]")).getText();
		Thread.sleep(3000);
		System.out.println(price);
		} 
		else {
		System.out.println("we are not on ajio home page");
		}
		Thread.sleep(3000);
		driver.quit();
		}
		
	}
