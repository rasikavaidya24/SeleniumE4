package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DwsShoppingCart1 {

	public static void main(String[] args) throws InterruptedException{
		String exp_result= "Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		String act1_result = driver.getTitle();
		if(exp_result.equals(act1_result)) {
			System.out.println("Verification successfull");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads'")).click();
		List<WebElement> add_cart= driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement i : add_cart)
		{
			i.click();
			Thread.sleep(2000);

		}
		driver.findElement(By.className("cart-label")).click();

		List<WebElement> remove_cart = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for(WebElement i : remove_cart)
		{
		i.click();
		Thread.sleep(1000);
		}


		driver.findElement(By.name("updatecart")).click();

		}else {
		System.out.println("Verification Failed");
		driver.close();
		}
		Thread.sleep(3000);
		driver.close();

	}

}
