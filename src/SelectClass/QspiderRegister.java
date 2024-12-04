package SelectClass;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class QspiderRegister {

		public static void main(String[] args) throws InterruptedException {
					//open the browser
					WebDriver driver=new ChromeDriver();
					
					//maximize the browser
					driver.manage().window().maximize();
					
					//waiting condition
					Thread.sleep(3000);
					
					//enter into web page
					//String path="https://demoapps.qspiders.com/ui/formValidation?sublist=0";
					driver.get("https://demo.automationtesting.in/Register.html");
					
					driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Rasika");
					
					driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Vaidya");
				
					driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Pune");
					//Thread.sleep(500);
					driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("rasika123@gmail.com");
					//Thread.sleep(500);
					driver.findElement(By.cssSelector("input[type=\"tel\"]")).sendKeys("9284329636");
					//Thread.sleep(500);
					driver.findElement(By.cssSelector("input[value=\"FeMale\"]")).click();
					//Thread.sleep(500);
					driver.findElement(By.cssSelector("input[value=\"Movies\"]")).click();
					//Thread.sleep(500);
					//driver.findElement(By.cssSelector("div[id='msdd']")).sendKeys("English");
					Thread.sleep(500);
					
					WebElement single_select = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
					Thread.sleep(3000);
					
					Select sel=new Select(single_select);
					
					//(1)select by visible text
					sel.selectByVisibleText("APIs");
					Thread.sleep(3000);
					
					WebElement single_select_year = driver.findElement(By.id("yearbox"));
					Thread.sleep(3000);
					Select sel2=new Select(single_select_year);
					sel2.selectByVisibleText("2000");
					Thread.sleep(3000);
					
					////select[@placeholder="Month"] ---August
					WebElement single_select_month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
					Thread.sleep(3000);
					Select sel3=new Select(single_select_month);
					sel3.selectByVisibleText("August");
					Thread.sleep(3000);
					
					//id-daybox-
					
					WebElement single_select_day= driver.findElement(By.id("daybox"));
					Thread.sleep(3000);
					Select sel4=new Select(single_select_month);
					sel4.selectByVisibleText("12");
					Thread.sleep(3000);
					
					driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Rasika@123");
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Rasika@123");
					Thread.sleep(3000);
					
					driver.close();
					

		}

	}



