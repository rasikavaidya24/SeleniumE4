package UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassDws {
	public static WebDriver driver;

	public static void preCondition1() throws InterruptedException {
       //open the browser
		 driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
        //enter into dws
		driver.get("https://demowebshop.tricentis.com/");

	}
	public static void  preCondition2() throws InterruptedException {
	       //open the browser
			 driver = new FirefoxDriver();
			//maximize browser
			driver.manage().window().maximize();
			//waiting condition
			Thread.sleep(2000);
	        //enter into dws
			driver.get("https://demowebshop.tricentis.com/");
	}
	public static void  preCondition3() throws InterruptedException {
	       //open the browser
			 driver = new EdgeDriver();
			//maximize browser
			driver.manage().window().maximize();
			//waiting condition
			Thread.sleep(2000);
	        //enter into dws
			driver.get("https://demowebshop.tricentis.com/");
	}
	
	public static void postCondition1() {
		System.out.println("thank u pls come again...");
		driver.close();
		
	}
	public static void postCondition2() {
		System.out.println("thank u pls come again...");
		driver.quit();
		
	}
}
