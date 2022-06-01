package com.SauceDemo.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.SauceDemo.Utility.Listners.class)

public class ListenersSample 
{
	WebDriver driver;
	
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertTrue(false);
	}

	
}
