package Basic;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
         driver.manage().window().maximize();
         //nykaa
         driver.get("https://www.nykaa.com/sp/new-customers-mweb/new-customers?pagetitle=new-customers-mweb&utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa_NCA&hlp=hlpa&gad_source=1&gclid=CjwKCAjwk8e1BhALEiwAc8MHiKak1Ob2D45ccenq4qpQ3X4LuzUijLEHNjwS-voddrL2vRgBRIqRBhoCKGIQAvD_BwE");
         driver.close();


	}

}
