package Basic;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException{
		// open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
        driver.manage().window().maximize();
        //enter into the webpage
        //waiting conditions
        Thread.sleep(3000);
        driver.get("https://www.google.com/search?q=amazon&oq=amazon&gs_lcrp=EgZjaHJvbWUqBwgAEAAYjwIyBwgAEAAYjwIyGwgBEC4YQxiDARjHARixAxjJAxjRAxiABBiKBTIMCAIQIxgnGIAEGIoFMgwIAxAjGCcYgAQYigUyEggEEAAYQxiDARixAxiABBiKBTINCAUQABiSAxiABBiKBTINCAYQABiSAxiABBiKBTIKCAcQABixAxiABDIHCAgQABiPAjIHCAkQABiPAtIBCTU5MzdqMGoxNagCCbACAQ&sourceid=chrome&ie=UTF-8");
        //close the browser
        driver.close();


	}

}
