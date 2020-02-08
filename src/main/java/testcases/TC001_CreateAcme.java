package testcases;

import org.testng.annotations.Test;

import pages.CreateAcme;
import seleniumbase.ProjectSpecific;

public class TC001_CreateAcme extends ProjectSpecific {
	@Test
	public void runCreateAcme() throws InterruptedException {
		new CreateAcme().UserName().Password().Login().verifyTitle();
	}

}
