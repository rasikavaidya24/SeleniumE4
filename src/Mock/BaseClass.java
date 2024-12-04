package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void preCondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void Login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rasika24@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vaidya@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	public static void LogOut() {
	driver.findElement(By.linkText("Log out")).click();
	}
	public static void postCondition1()
	{
		System.out.println("thank you please come again.......");
		driver.close();
		
	}
	public static void postCondition2()
	{
		System.out.println("thank you please come again");
		driver.quit();
	}

}