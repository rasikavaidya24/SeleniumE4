package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethhod {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
        driver.manage().window().maximize();
        //waiting conditions
        Thread.sleep(3000);
        
        driver.navigate().to("https://demowebshop.tricentis.com/");
        WebElement search_field= driver.findElement(By.id("small=searchterm"));
        if(search_field.isEnabled()) {
        	System.out.println("element is enabled");
        	search_field.sendKeys("Bile");
        }
        else {
        	System.out.println("element is disable..");
        	driver.close();
        }
        Thread.sleep(3000);
        driver.close();
        
	}

}
