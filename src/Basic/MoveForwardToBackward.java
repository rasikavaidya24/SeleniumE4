package Basic;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveForwardToBackward {

	
		public static void main(String[] args) throws InterruptedException{
			// open the browser
			ChromeDriver driver=new ChromeDriver();
			//maximize the browser
	        driver.manage().window().maximize();
	        //waiting conditions
	        Thread.sleep(3000);
	        //enter into dws
	        driver.navigate().to("https://demowebshop.tricentis.com/");
	        Thread.sleep(3000);
	        //enter into webpage
	        driver.get("https://www.redbus.in/3");
	        Thread.sleep(3000);
	        driver.navigate().back();
	        Thread.sleep(3000);
	        driver.navigate().forward();
	        Thread.sleep(3000);
	        driver.navigate().refresh();
	        Thread.sleep(3000);
            driver.close();
            
		}

}
