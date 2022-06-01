package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.Utility.Screenshot;

public class TC03_SingleProduct extends TestBaseClass
{
	
	//Home Page
	
	@Test
	public void singleProductTest() throws InterruptedException, IOException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		//Single product
		
		hp.addSingleProduct();
		log.info("Single product is added to cart");
		
		Thread.sleep(2000);
		Screenshot.screenshotMethod(driver);
		
		//Validation 
		
		String ExpTitle = "Swag Labs";
		String ActTitle = driver.getTitle();
				
		Assert.assertEquals(ExpTitle, ActTitle);
		log.info("Single Product Test Case Passed");
		
	}
				

}
