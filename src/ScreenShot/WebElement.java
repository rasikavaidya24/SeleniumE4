package ScreenShot;

import java.io.File;
import java.util.logging.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import UtilityClass.CrossBrowserTesting;
import java.io.IOException;


public class WebElement extends CrossBrowserTesting{

	public static void main(String[] args) throws InterruptedException, IOException {
		preCondition("chrome");
		Thread.sleep(2000);
		org.openqa.selenium.WebElement dws_icon = driver.findElement(By.className("header-logo"));
		File from = dws_icon.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\SelenuiumScreenshot\\Icon.png");
		org.openqa.selenium.io.FileHandler.copy(from,to);
		

	}

}

