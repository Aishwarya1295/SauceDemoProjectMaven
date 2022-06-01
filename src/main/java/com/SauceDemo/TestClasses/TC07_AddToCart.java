package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.Utility.Screenshot;

public class TC07_AddToCart extends TestBaseClass
{
		
	//Home Page
		
	@Test
	public void addToCart() throws InterruptedException, IOException
	{
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		hp.addProducts();
		log.info("Products added in the Cart");
				
		Thread.sleep(2000);
	    Screenshot.screenshotMethod(driver);
	    
	   // click on cart
	    
	    hp.clickOnCart();
	    log.info("Click on Cart Button");
	    
	    Thread.sleep(2000);
	    Screenshot.screenshotMethod(driver);
	    
	    //Validation
	    
	    String ExpText = "3";
	    
	    Assert.assertEquals(ExpText, hp.getCartText());
	    log.info("Add to Cart Test Case Passed");
	  
	}
	    
}
