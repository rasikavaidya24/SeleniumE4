//Q.write the script for agoda application 
//1)open browser
//2)maximiaze
//3)enter into agoda webpage
//4)verify the page by using url
//5)select a date inside departure date i.e. 28sept
//6)select a date inside return date i.e. 28Jan 2026
//&)close the browser
package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskOnAgodaPopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		//open the browser
        ChromeDriver driver=new ChromeDriver(options);
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		Thread.sleep(2000);
	    driver.get("https://www.agoda.com/en-in/?site_id=1922885&tag=6f147157-60b8-459f-af1a-9935d44970e9&gad_source=1&device=c&network=g&adid=695788229730&rand=224391764085906518&expid=&adpos=&aud=kwd-2230651387&gclid=Cj0KCQjwurS3BhCGARIsADdUH52IR0HCjEji0Th7lz8RjmyyMzFfibwLyD3F-OfwxhoILJ5_HUPKM6saAqO1EALw_wcB&pslc=1&ds=HpVQ1YsP1AHawojc");
	    Thread.sleep(3000);
	    driver.findElement(By.id("29 Sep 2024")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("Jan ")).click();
	    driver.close();
	}
	

}
