package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CartPagePOMClass;
import com.SauceDemo.POMClasses.CheckoutPagePOMClass;
import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.YourInfoPagePOMClass;
import com.SauceDemo.Utility.Screenshot;

public class TC09_BuyProduct extends TestBaseClass 
{
		
	//Home Page
		
	@Test
	public void buyProduct() throws InterruptedException, IOException
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
	    
	    // Go to Your Info Page
	    
	    YourInfoPagePOMClass yp = new YourInfoPagePOMClass(driver);
	    
	    yp.sendFirstname();
	    log.info("Enter First Name");
	    
	    yp.sendLastname();
	    log.info("Enter Last Name");
	    
	    yp.sendZipcode();
	    log.info("Enter Zip Code");
	    
	    Thread.sleep(2000);
	    Screenshot.screenshotMethod(driver);
	    
	    yp.clickContinueButton();
	    log.info("Click on continue Button");
	    
	    Thread.sleep(2000);
	    Screenshot.screenshotMethod(driver);
	    
	    // Go to checkout Page
	    
	    CheckoutPagePOMClass chp = new CheckoutPagePOMClass(driver);
	    
	    chp.clickFinishButton();
	    log.info("Click on Finish Button");
	    
	    Thread.sleep(2000);
	    Screenshot.screenshotMethod(driver);
	    
	    //Validation
	    
	   String ExpUrl = "https://www.saucedemo.com/checkout-complete.html";
	   String ActUrl = driver.getCurrentUrl();
	   
	   Assert.assertEquals(ExpUrl, ActUrl);
	   
	 
	}
	    
}
