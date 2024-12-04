package TestScript;

import org.testng.annotations.Test;

import com.crm.baseClass.DwsBaseClass;

public class ClickAllTheLinks extends DwsBaseClass{
	@Test

	public void testScript1() throws InterruptedException {
		System.out.println("testScript1");
		Thread.sleep(3000);
		
	}
	@Test
	public void testScript2() throws InterruptedException { 
		System.out.println("testScript");
		Thread.sleep(3000);

	}

}
