package seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecific {
	
	
		public static ChromeDriver driver;
		@BeforeMethod
		public void beforemethod() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

 @AfterMethod 
 public void aftermethod() { 
	 driver.close(); 
	 }
	 
	}


		
	
