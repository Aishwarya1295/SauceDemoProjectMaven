package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_LoginFunctionality extends TestBaseClass
{
	
	//Validation
	
	@Test
	public void loginFunctionalityTest() throws IOException
	{		
		String ExpTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		
		//Hard Assert
		
		Assert.assertEquals(ActualTitle, ExpTitle);
		log.info("Test Case Passed");
	}
	
}
