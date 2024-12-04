package ScreenShot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import UtilityClass.CrossBrowserTesting;

public class WebPageScreenShot extends CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException, IOException {
		preCondition("chrome");
		driver.findElement(By.id("small-searchterms")).sendKeys("Camera");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\SeleniumScreensort//DwsHomePage.png");
	org.openqa.selenium.io.FileHandler.copy(from, to);
		
	}

}
