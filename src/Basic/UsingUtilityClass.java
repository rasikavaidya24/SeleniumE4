package Basic;

import org.openqa.selenium.By;
import UtilityClass.BaseClassDws;

public class UsingUtilityClass extends UtilityClass.BaseClassDws {

	public static void main(String[] args) throws InterruptedException{
		String excepted_result="https://demowebshop.tricentis.com/";
		preCondition1();
		String actual_result=driver.getCurrentUrl();
		System.out.println(actual_result);
		if(excepted_result.equals(actual_result)) {
			System.out.println("iam in dws page");
			driver.findElement(By.id("small-searchterms")).sendKeys("books");
			

		}else {
			System.out.println("iam not in dws page");
			postCondition1();
		}
		postCondition1();
		

	}

}
