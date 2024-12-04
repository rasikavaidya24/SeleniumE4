package Basic;
//Registration Page
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
        
		String expected_result="https://demowebshop.tricentis.com/";
		String expected_result_url="https://demowebshop.tricentis.com/register";
		
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
        	System.out.println("Im in homepage");
        	driver.findElement(By.className("ico-register")).click();
        	String actual_register_url=driver.getCurrentUrl();
        }
        else {
        	System.out.println("Im not in homepage");
            driver.close();        	
        }
       Thread.sleep(3000);
	   driver.close();
        
	}
	
}

        
        
        
    
