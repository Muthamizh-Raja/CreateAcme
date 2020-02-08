package pages;

import org.openqa.selenium.Keys;

import seleniumbase.ProjectSpecific;

public class CreateAcme extends ProjectSpecific {
	public CreateAcme UserName() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		return this;
	}
	public CreateAcme Password() {
		driver.findElementById("password").sendKeys("leaf@12");
		return this;
	}
	public Homepage Login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementById("buttonLogin").click();
		return new Homepage();
		}
	
	
		
		
		
	}


