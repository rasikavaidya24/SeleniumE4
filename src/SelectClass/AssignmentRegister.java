package SelectClass;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import java.time.Duration;

	//org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
	public class AssignmentRegister {

	public static void main(String[] args) throws InterruptedException {
	        // Set up ChromeDriver (make sure ChromeDriver path is set in system properties)
	        WebDriver driver = new ChromeDriver();
	        
	        try {
	            // Maximize the browser
	            driver.manage().window().maximize();
	            
	            // Navigate to the web page
	            driver.get("https://demowebshop.tricentis.com/");
	            System.out.println("You are in the DWS page...");
	            
	            // Wait until the "Digital downloads" link is clickable and click it
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement digitalDownloadsLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Digital downloads")));
	            digitalDownloadsLink.click();
	            
	            // Wait until the "Sort by" dropdown is visible
	            WebElement sortByDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-orderby")));
	            
	            // Create a Select object for the "Sort by" dropdown
	            Select sortBySelect = new Select(sortByDropdown);
	            List<WebElement> sortByOptions = sortBySelect.getOptions();
	            
	            // Loop through each option in the "Sort by" dropdown and select it
	            for (int i = 0; i < sortByOptions.size(); i++) {
	                sortBySelect.selectByIndex(i);
	                Thread.sleep(2000);  // Adding a small delay to observe each selection
	            }

	            // Wait until the "Display" dropdown is visible
	            WebElement displayDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-pagesize")));
	            
	            // Create a Select object for the "Display" dropdown
	            Select displaySelect = new Select(displayDropdown);
	            List<WebElement> displayOptions = displaySelect.getOptions();
	            
	            // Loop through each option in the "Display" dropdown and select it
	            for (int i = 0; i < displayOptions.size(); i++) {
	                displaySelect.selectByIndex(i);
	                Thread.sleep(2000);  // Adding a small delay to observe each selection
	            }

	            // Wait until the "View mode" dropdown is visible
	            WebElement viewModeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-viewmode")));
	            
	            // Create a Select object for the "View mode" dropdown
	            Select viewModeSelect = new Select(viewModeDropdown);
	            List<WebElement> viewModeOptions = viewModeSelect.getOptions();
	            
	            // Loop through each option in the "View mode" dropdown and select it
	            for (int i = 0; i < viewModeOptions.size(); i++) {
	                viewModeSelect.selectByIndex(i);
	                Thread.sleep(2000);  // Adding a small delay to observe each selection
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace();  // Print the stack trace if an exception occurs
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	

	}


