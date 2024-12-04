//assignment 2:::write script for demo web shop 1 open the browser 2 maximize 3 enter dws 4 verify pg using title
//5 click digital download session 6 we see 3 product 7 add all 3 products  8 by using findElements
//9 after adding we need to remove all the 3 product.

package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsShopping {

	public static void main(String[] args) throws InterruptedException{
		String exp_result = "Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		String actl_result = driver.getTitle();
		if(exp_result.equals(actl_result))
		{
		System.out.println("Verification Successful");

        driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> add_cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
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


