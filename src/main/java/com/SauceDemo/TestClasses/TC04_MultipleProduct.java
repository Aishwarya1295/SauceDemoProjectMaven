package com.SauceDemo.TestClasses;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.Utility.Screenshot;

public class TC04_MultipleProduct extends TestBaseClass
{
		
	//Home Page
	
	@Test
	public void multipleProducts() throws InterruptedException, IOException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		//Multiple products
		
		hp.addProducts();
		log.info("3 products added to the cart");
		
		Thread.sleep(2000);
		Screenshot.screenshotMethod(driver);
		
		//Validation 
		
		String ExpTitle = "Swag Labs";
		String ActTitle = driver.getTitle();
				
		Assert.assertEquals(ExpTitle, ActTitle);
		log.info("3 Products Test Case Passed");
	
	}

	
}
