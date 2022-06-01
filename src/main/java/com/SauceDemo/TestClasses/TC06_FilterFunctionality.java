package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
public class TC06_FilterFunctionality extends TestBaseClass
{		
	
	//Home Page
	
	@Test
	public void filterFunctionality() throws InterruptedException, IOException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		hp.applyFilter();
		log.info("Filter is applied");
		
		Thread.sleep(2000);
		
		//Validation ---- need to apply get text validation
		
		System.out.println(hp.getFilterText());
		
		String ExpText = "Name (Z to A)";
		
		Assert.assertEquals(ExpText, hp.getFilterText());
		log.info("Filter Functionality Test Case Passed");
		
	}
	
	
}
