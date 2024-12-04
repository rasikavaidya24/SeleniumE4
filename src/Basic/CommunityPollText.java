package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommunityPollText {

	public static void main(String[] args) throws InterruptedException{
 
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
        driver.manage().window().maximize();
        //waiting conditions
        Thread.sleep(3000);
        //enter into dws
        driver.get("https://demowebshop.tricentis.com/");
        WebElement poll= driver.findElement(By.xpath("//strong[text()='Community poll']"));
        if(poll.isDisplayed()) {
            Thread.sleep(3000);
        	System.out.println("iam in dws homepage");
        	List<WebElement> community_poll=driver.findElement(By.xpath("//input[@type='radio']"));
        	for(int i = 0;i <4; i++) {   	
            community_poll.get(i).click(); 
            Thread.sleep(2000);
        }
            }
        else {
        	System.out.println("iam not in homepage");
        	
        }
        
	}

}
