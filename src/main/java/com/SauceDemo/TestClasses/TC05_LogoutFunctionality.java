package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.Utility.Screenshot;

public class TC05_LogoutFunctionality extends TestBaseClass 
{
		
	//Home Page
	
	@Test
	public void logoutFunctionality() throws InterruptedException, IOException
	{
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		//logout 
		
		hp.clickHamburger();
		log.info("Hamburger Opened");
		
		Thread.sleep(2000);
		Screenshot.screenshotMethod(driver);
		
		hp.clickLogoutButton();
		log.info("click on logout button");
		
		//Validation 
		
		String ExpTitle = "Swag Labs";
		String ActTitle = driver.getTitle();
						
		Assert.assertEquals(ExpTitle, ActTitle);
		log.info("Logout Test Case Passed");
	
	}
	
}
