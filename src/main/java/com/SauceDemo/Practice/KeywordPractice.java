package com.SauceDemo.Practice;

import org.testng.annotations.Test;

public class KeywordPractice
{
	@Test(priority = 1, enabled = false)
	public void testClassA()
	{
		System.out.println("Test Class Method");
	}
	
	@Test(priority = -1, invocationCount = 3)
	public void testClassB()
	{
		System.out.println("Test Class Method");
	}
	
	@Test(priority = 0)
	public void testClassC()
	{
		System.out.println("Test Class Method");
	}
	
	@Test(priority = 3)
	public void testClassD()
	{
		System.out.println("Test Class Method");
	}
	
	@Test(priority = 0)
	public void testClassE()
	{
		System.out.println("Test Class Method");
	}
	
	@Test(priority = -3, timeOut = 6000)
	public void testClassF() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Test Class Method");
	}
	
}
