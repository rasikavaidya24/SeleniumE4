package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadMultipleDataFromXml {
	@Parameters(("url","login","password"))
	@Test
	
	public void login(String url,String login,String password) throws InterruptedException {
		String expected_result="https://demowebshop.tricentis.com";
		String expected_result1="Demo web shop. Login";
		ChromeDriver driver=new ChromeDriver();
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		Thread.sleep(3000);
		//enter into dws
		driver.get(url);
		Thread.sleep(3000);
        String actual_result=driver.getCurrentUrl();
        if(expected_result.equals(actual_result))
        {
        	System.out.println("iam in dws home page");
        	driver.findElement(By.linkText("Log in")).click();
        	String actual_result1= driver.getTitle();
        	if(actual_result1.equals(expected_result1))
        	{
            	System.out.println("iam in login page");
            	driver.findElement(By.id("Email")).sendKeys(login);
            	driver.findElement(By.name("Password")).sendKeys(password);
            	driver.findElement(By.id("Remember me")).click();
        		Thread.sleep(3000);
                driver.findElement(By.cssSelector("input[value='Log in']")).click();
        		Thread.sleep(3000);
                driver.close();
               
        	}
        	else {
            	System.out.println("iam not in login page");
            	driver.close();
        	}
        }
        else {
        	System.out.println("iam not in dws home page");
        	driver.close();

        }
		
	}

}
