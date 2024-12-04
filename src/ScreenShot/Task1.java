package ScreenShot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task1  {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		String expectedResult="Demo Web Shop";
		
		if (driver.getTitle().equals(expectedResult))
		{
			System.out.println("page is verified succesfully");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("mina12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Abc123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		}
		
		try {
			driver.findElement(By.className("validation-summary-errors"));
			System.out.println("*You Enter a Wrong Credentials*");
		}
		catch (Exception e) {
			System.out.println("**You enter in a Login Page");
			//*screenshot*
			TakesScreenshot ts=(TakesScreenshot) driver;
			 File from =ts.getScreenshotAs(OutputType.FILE);
			 File to=new File("C:\\SeleniumScreensort//wrongPage.png"); // we have to pas the path of ss
			 FileHandler.copy(from, to);
		
		}
	
	}	
}
