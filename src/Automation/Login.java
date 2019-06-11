package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Login {
		
		private WebDriver driver;
		private String baseUrl;
		
	
	
	 
	public static void main(String[] args) throws InterruptedException {

 
		
		@Before
		// Create an instance of the driver. Declaration and instantiation of objects/variables
	
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\npinchuk\\Automation\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		String baseUrl = "https://version.ardevel.net/index.php?s1=login";
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Navigate to a web page
		driver.get("https://version.ardevel.net/index.php?s1=login");
	    
		//Perform actions on HTML elements, entering text and submitting the form
		
		WebElement username = driver.findElement(By.id("username"));
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("npinchuk");
	    
	    Thread.sleep(5000);
	    
	    WebElement password = driver.findElement(By.id("password"));
	    
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Np&Ar29#");
	    
	    Thread.sleep(5000);
	    
	    
	    
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::input[2]")).click();
	    WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]/form/div/div/div[5]/div[2]/input"));
	   
	    
	    driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[1]/a")).click();
	    //WebElement  = driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[1]/a")).click();
	    
	    driver.close();
	    driver.quit();
			
			
		
	}

}
