package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromExcel {
	
	public void login() throws EncryptedDocumentException, IOException, InterruptedException{
		FileInputStream fis = new FileInputStream("C:\\Users\\RASIKA\\Desktop\\Selenium\\login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("Sheet1");
		String email = sheet.getRow(0).getCell(0).toString();
		String password = sheet.getRow(0).getCell(1).toString();
		System.out.println(email);
		System.out.println(password);
		
		//open the browser
        WebDriver driver=new ChromeDriver();
	    //maximize the browser
		driver.manage().window().maximize();
		//waiting conditions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into dws
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("password")).sendKeys(password);

		
		
	}
	

}
