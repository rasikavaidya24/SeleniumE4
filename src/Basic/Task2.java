package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Login Page
public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		String expected_result="https://demowebshop.tricentis.com/";
		String expected_result1="Demo web shop";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
        driver.manage().window().maximize();
        //waiting conditions
        Thread.sleep(3000);
       //enter into dws
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        
        String actual_result=driver.getCurrentUrl();
        if(expected_result.equals(actual_result)) {
        	System.out.println("Im in dws homepage");
        	driver.findElement(By.linkText("Log in")).click();
        	
        	String actual_result1=driver.getTitle();
        	if(actual_result1.equals(expected_result1)) {
        		System.out.println("i am in login page");
        		driver.findElement(By.id("Email")).sendKeys("rasikavaidya24@gmail.com");
        		driver.findElement(By.name("Password")).sendKeys("r213@2");
        		driver.findElement(By.id("RememberMe")).click();  
                Thread.sleep(3000);

                driver.findElement(By.cssSelector("input[value='Log in']")).click();
                Thread.sleep(3000);
                driver.close();        	
        		}
        
        else {
        	System.out.println("Im not in login page");
            driver.close();        	
        }
        }
	  else {

        	System.out.println("Im not in  homepage");
            driver.close();        	
        }
        

	}

}
