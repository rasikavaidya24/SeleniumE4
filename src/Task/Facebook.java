package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
        String expected_result="https://www.facebook.com/";
		//open the browser
		 WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
      //enter into Web page
		driver.get("https://www.facebook.com/");
		String actual_result=driver.getCurrentUrl();
        if(expected_result.equals(actual_result)) {
        	System.out.println("Im in facebook homepage");
        	driver.findElement(By.id("u_0_0_m8")).click();
        	//driver.findElement(By.linkText("Create a new account")).click();
        	
 
        }
        else {
        	System.out.println("Im not in facebook page");
            driver.close();        	
        }
    Thread.sleep(3000);
	driver.close();
        
	
	}

}
