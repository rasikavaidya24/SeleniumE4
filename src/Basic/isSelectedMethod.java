package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
				ChromeDriver driver=new ChromeDriver();
				//maximize the browser
		        driver.manage().window().maximize();
		        //waiting conditions
		        Thread.sleep(3000);
		        
		        driver.navigate().to("https://demowebshop.tricentis.com/");
		        WebElement excellent= driver.findElement(By.id("pollanswers-1"));
				//excellent .click();
		        if(excellent.isSelected()) {
		        	System.out.println("Element is selected....");
		        }
		        else {
		        	System.out.println("Element is not selected....");

		        }
		        
	}

}
