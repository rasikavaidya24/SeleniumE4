package PopUp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotification {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		//open the browser
        ChromeDriver driver=new ChromeDriver();
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		Thread.sleep(2000);
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=Cj0KCQjwi5q3BhCiARIsAJCfuZlagA4g0K1GOWMZ8mmDKwxx8ZvS8qbogkIhuCym-CPvt9xoyWntxkMaAoEWEALw_wcB");
		Thread.sleep(3000);
		
	}

}
