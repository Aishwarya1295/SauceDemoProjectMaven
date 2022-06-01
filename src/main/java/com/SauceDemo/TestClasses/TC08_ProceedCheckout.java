package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.POMClasses.CartPagePOMClass;
import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.Utility.Screenshot;

public class TC08_ProceedCheckout extends TestBaseClass
{
		
	//Home Page
		
	@Test
	public void proceedCheckout() throws InterruptedException, IOException
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
	    
	    //Go to Cart Page 
	    
	    CartPagePOMClass cp = new CartPagePOMClass(driver);
	    
	    cp.clickCheckout();
	    log.info("Click on Checkout Button");
	    
	    //Validation
	    
	    String ExpUrl = "https://www.saucedemo.com/checkout-step-one.html";
	    String ActUrl = driver.getCurrentUrl();
	    
	    SoftAssert soft = new SoftAssert();
	    
	    soft.assertEquals(ActUrl, ExpUrl);
	    
	    soft.assertAll();
	  
	}
	
}
