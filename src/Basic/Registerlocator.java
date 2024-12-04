package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerlocator {

	public static void main(String[] args)throws InterruptedException {

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
        	driver.findElement(By.linkText("Register")).click();
        	String actual_result1=driver.getTitle();
        	if(actual_result1.equals(expected_result1)) {
        		System.out.println("i am in register page");
        		      
	}

        }
