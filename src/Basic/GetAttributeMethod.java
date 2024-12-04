package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException{
		String data="mobile";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
        driver.manage().window().maximize();
        //waiting conditions
        Thread.sleep(3000);
        
        driver.navigate().to("https://demowebshop.tricentis.com/");
        WebElement search_field= driver.findElement(By.name("q"));
        search_field.sendkeys(data);
        String data1= search_field.getAttribute("value");
        System.out.println(data);
        if(data.equals(data1))
        {
        	System.out.println("data is successfully passed...");
        }
        else {
            System.out.println("passing the data is unsuccessfull");

        }
        driver.close();
        } 
        
        
	}


