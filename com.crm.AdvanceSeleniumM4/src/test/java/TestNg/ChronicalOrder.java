package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronicalOrder {
	@BeforeSuite
	public void beforeSuite() {
		
		
	}
	@BeforeTest
	public void beforeTest() {
		
	}
	@BeforeClass
	public void beforeClass() {
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
	}
	@AfterTest
	public void afterTest() {
		
	}
	@AfterSuite
	public void afterSuite() {
		
	}
	@AfterClass
	public void afterClass() {
		
	}
	@Test
	public void TestScript() {
		System.out.println("Test Script");
		
	}

}
