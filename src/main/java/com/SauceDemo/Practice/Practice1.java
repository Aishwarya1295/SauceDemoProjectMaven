package com.SauceDemo.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice1 
{
	@BeforeClass
	public void methodBeforeClass()
	{
		System.out.println("Before class Method");
	}
	
	@BeforeSuite
	public void methodBeforeSuit()
	{
		System.out.println("Before Suit Method");
	}
	
	@AfterMethod
	public void methodAfterMethod()
	{
		System.out.println("After Method - Method");
	}
	
	@BeforeMethod
	public void methodBeforeMethod()
	{
		System.out.println("Before Method - Method");
	}
	
	@AfterSuite
	public void methodAfterSuite()
	{
		System.out.println("After Suite Method");
	}
	
	@AfterClass
	public void methodAfterClass()
	{
		System.out.println("AFter Class Method");
	}
	
	@AfterTest
	public void methodAfterTest()
	{
		System.out.println("After Test Method");
	}
	
	@BeforeTest
	public void methodBeforeTest()
	{
		System.out.println("Before Test Method");
	}
	
	@Test
	public void testClass()
	{
		System.out.println("Test Class Method");
	}
	
}
