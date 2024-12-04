package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClassDws;

public class DifferentBtCloseAndQuite extends BaseClassDws {

		public static void main(String[] args) throws InterruptedException{
			String excepted_result="https://demowebshop.tricentis.com/";
			String excepted_result1="https://demowebshop.tricentis.com/news/rss/1";
			preCondition1();
			String actual_result=driver.getCurrentUrl();
			System.out.println(actual_result);
			if(excepted_result.equals(actual_result)) {
				System.out.println("iam in dws page");
				List<WebElement> web_links= driver.findElements(By.xpath("//div[@class='column follow-us']"));
				for (WebElement web : web_links)
				{
					web.click();
					String actual_result1 = driver.getCurrentUrl();
					Thread.sleep(2000);
					if(excepted_result1.equals(actual_result1)) {
						driver.navigate().back();					
				
					}
				}	

	}
			else {
				System.out.println("iam not in dws page");
				postCondition2();
			}
			postCondition2();
		}

}
