package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.CrossBrowserTesting;

public class Twitter extends CrossBrowserTesting
{

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://x.com/BillGates");
		org.openqa.selenium.WebElement dws_icon = driver.findElement(By.cssSelector("css-175oi2r r-1niwhzg r-vvn4in r-u6sd8q r-1p0dtai r-1pi2tsx r-1d2f490 r-u8s1d r-zchlnj r-ipm5af r-13qz1uu r-1wyyakw r-ehq7j7"));
		File from = dws_icon.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\SelenuiumScreenshot\\TwitterIcon.png");
		FileHandler.copy(from, to);
		
		



	}

}
