package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommunityPollText1 {
	public static void main(String[] args) throws InterruptedException{
		 
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
        driver.manage().window().maximize();
        //waiting conditions
        Thread.sleep(3000);
        //enter into dws
        driver.get("https://demowebshop.tricentis.com/");
        WebElement poll= driver.findElement(By.xpath("//label [text()='Excellent']"));
        String data=poll.getText();
        System.out.println(data);


}
}
