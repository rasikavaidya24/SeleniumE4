package Mock;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class task1 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition();		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rasika24@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vaidya@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com/nopCommerce']")).click();
		Thread.sleep(3000);
		
		Set<String> child = driver.getWindowHandles();
	
		for(String str : child) {
			driver.switchTo().window(str);
		}
		
		driver.findElement(By.xpath("//div[@aria-label='Create new account']")).click();
        Thread.sleep(1000); 
        
        Set<String> child2 = driver.getWindowHandles();
        
        for(String str1 : child2) {
			driver.switchTo().window(str1);
		}
        
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rasika");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vaidya");
        Thread.sleep(1000);
        
        WebElement day = driver.findElement(By.xpath("//select[@id='day']")); 
        Select sel = new Select(day);
        sel.selectByVisibleText("24");
       
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select sel1 = new Select(month);
        sel1.selectByVisibleText("Dec");
        
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select sel2 = new Select(year);
        sel2.selectByVisibleText("1998");
        
        driver.findElement(By.xpath("//input[@value='1']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876567658");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Vaidya@123");
        Thread.sleep(1000);
        
        driver.switchTo().window(parent);
        
        driver.findElement(By.xpath("//a[@href='/logout']")).click();
        Thread.sleep(1000);
        
        driver.close();
	}

	

		
}

