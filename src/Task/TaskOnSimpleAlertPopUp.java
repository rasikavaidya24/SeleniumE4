package Task;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOnSimpleAlertPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}
}


	


