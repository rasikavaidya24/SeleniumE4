//Q. Write a script for red bus website

//1)open the browser 
//2)maximize
//3)enter into
//4)verify the ppage by using title
//5)fill all the details of from and TO section 
//6)In date click 27sept and search the bus
package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOnRedBusPopUp {

	public static void main(String[] args) throws InterruptedException {
		String expected_result="Bus Ticket Booking Online made easy";
		//open the browser
        ChromeDriver driver=new ChromeDriver();
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		Thread.sleep(2000);
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		String actual_result=driver.getTitle();
		if(expected_result.equals(actual_result))
		{
			System.out.println("i am in redbus homepage");
			driver.findElement(By.xpath("//div[@id='src']")).sendKeys("deccan");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='dest']")).sendKeys("sadashiv peth");
			Thread.sleep(3000);
			driver.findElement(By.className("labelCalendarContainer")).click();
			driver.findElement(By.id("img2Nex")).click();
			
		}
		else {
			System.out.println("i am not in redbus homepage");
		}
	

	}
}
