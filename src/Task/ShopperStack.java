package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		 WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
     //enter into Web page
		driver.get("https://www.shoppersstack.com/");
		String expected_title="ShoppersStack";
		String actual_title=driver.getTitle();
		if(expected_title.equals(actual_title)) {
        	System.out.println("Im in shopperstack homepage");
		}
        else {
        	System.out.println("Im not in shopperstack page");
            driver.close();        	
        }
    Thread.sleep(3000);
	driver.close();
        
		}
		
	}


