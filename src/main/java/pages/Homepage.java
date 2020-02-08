package pages;

import org.openqa.selenium.WebElement;

import seleniumbase.ProjectSpecific;

public class Homepage extends ProjectSpecific {
	
	 public Homepage verifyTitle() throws InterruptedException { 
		 Thread.sleep(3000);
		 String title = driver.getTitle();
	 System.out.println(title); 
		 return this; 
	 }
	

}
