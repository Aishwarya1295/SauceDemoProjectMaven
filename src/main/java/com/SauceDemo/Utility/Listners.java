package com.SauceDemo.Utility;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener
{
	WebDriver driver;
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case is Successfully Passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		   System.out.println("Test case is failed and hence taking the screenshot");
		  	   
		   try 
		   {
			Screenshot.screenshotMethod(driver);
		   } 
		   catch (IOException e) 
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		  
	}	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Sanity test is started");
	}

	
}
