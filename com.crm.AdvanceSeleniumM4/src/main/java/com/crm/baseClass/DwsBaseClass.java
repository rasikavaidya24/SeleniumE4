package com.crm.baseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsBaseClass {
	WebDriver driver=null;
	@BeforeClass
	public void preCondition() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/"
				+ "");
	}
		
	@BeforeMethod
	public void login() {
    	driver.findElement(By.linkText("Log in")).click();
    	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
    	driver.findElement(By.name("Password")).sendKeys("admin01");
    	driver.findElement(By.id("Remember me")).click();
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
       	
	}
	@AfterMethod
	public void logOut() {
		driver.findElement(By.className("ico-logout")).click();
		
	}
		
	@AfterClass
	public void postCondition() {
		driver.quit();
	}

}
