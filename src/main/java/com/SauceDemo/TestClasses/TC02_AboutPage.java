package com.SauceDemo.TestClasses;


import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.Utility.Screenshot;

public class TC02_AboutPage extends TestBaseClass
{
	
	//Home Page
	
	@Test
	public void aboutPage() throws InterruptedException, IOException
	{
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		hp.clickHamburger();
		log.info("HomePage Opened");
		
		Thread.sleep(2000);
		Screenshot.screenshotMethod(driver);
		
		// click on About Page
		
		hp.clickAbout();
		log.info("click on About Page");
		
		Thread.sleep(2000);
		Screenshot.screenshotMethod(driver);
		
		//Validation 
		
		String ExpTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		String ActTitle = driver.getTitle();
		
		//Soft Assert
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(ExpTitle, ActTitle);
		
		soft.assertAll();
		
		log.info("Login Test Case Passed");
		
		
	}
	
}
