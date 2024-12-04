package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
        String expected_result="https://www.facebook.com/";
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
        driver.manage().window().maximize();
        //waiting conditions
        Thread.sleep(3000);
        
        driver.get("https://www.facebook.com/");
        String actual_result=driver.getCurrentUrl();
        if(expected_result.equals(actual_result)) {
        	System.out.println("Im in facebook homepage");
        	driver.findElement(By.linkText("Create a new account")).click();
        }
        else {
        	System.out.println("Im not in facebook page");
            driver.close();        	
        }
    Thread.sleep(3000);
	driver.close();
        
	}
	
}


