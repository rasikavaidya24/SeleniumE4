package Locators;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class isSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://demowebshop.tricentis.com/");

	WebElement excellent=driver.findElement(By.id("pollanswers-1"));
	excellent.click();

	if(excellent.isDisplayed())
	{
	System.out.println("Element is selected.....");

	}
	else {
	System.out.println("elementis not selected");
	}
	driver.close();

	}
}



