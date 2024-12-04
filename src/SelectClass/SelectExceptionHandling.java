package SelectClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExceptionHandling {
	public static void main(String[] args) throws InterruptedException {

String exceptedResult="https://demowebshop.tricentis.com/";
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(3000);
driver.get("https://demowebshop.tricentis.com/ ");
//Thread.sleep(3000);
String actualResult=driver.getCurrentUrl();


if(exceptedResult.equals(actualResult))
{
System.out.println("Im in DWS page");
driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
Thread.sleep(3000);
WebElement sortBy=driver.findElement(By.id("products-oredrby"));
Select sel=new Select(sortBy);
int i=0;


List<WebElement> products = sel.getOptions();
for(WebElement web:products)
{
sel.selectByIndex(i++);
sortBy=driver.findElement(By.id("products-oredrby"));
sel=new Select(sortBy);
Thread.sleep(3000);

}

WebElement sortBy1=driver.findElement(By.id("products-pagesize"));
Select sel1=new Select(sortBy1);
int j=0;


List<WebElement> products1 = sel1.getOptions();
for(WebElement web1:products1)
{
sel1.selectByIndex(j++);
sortBy1=driver.findElement(By.id("products-pagesize"));
sel1=new Select(sortBy1);
Thread.sleep(3000);

}

WebElement sortBy2=driver.findElement(By.id("products-oredrby"));
Select sel2=new Select(sortBy2);
int k=0;


List<WebElement> products2 = sel2.getOptions();
for(WebElement web:products2)
{
sel2.selectByIndex(k++);
sortBy2=driver.findElement(By.id("products-oredrby"));
sel2=new Select(sortBy2);
Thread.sleep(3000);

}
}

else {
System.out.println("Im not n DWS home page");
}

}

		

	}


