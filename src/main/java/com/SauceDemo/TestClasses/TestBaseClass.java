package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.Utility.Screenshot;

public class TestBaseClass 
{
	WebDriver driver;
	Logger log = Logger.getLogger("SauceDemoMaven");
	
	//Login
	
	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws InterruptedException, IOException
	{
		PropertyConfigurator.configure("log4j.properties");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			log.info("Chrome Browser Opened");
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		
			log.info("Firefox Browser Opened");
		}
		else
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		
			log.info("Edge Browser Opened");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		log.info("URL is opened");
		
		Thread.sleep(2000);
		Screenshot.screenshotMethod(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Login
		
		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
		
		lp.SendUsername();
		log.info("Enter the Username");
		
		lp.SendPassword();
		log.info("Enter the Password");
		
		Thread.sleep(2000);
		Screenshot.screenshotMethod(driver);
		
		lp.ClickLoginButton();
		log.info("Click on Login button");
		
	}
	
	//Browser Close
	
	@AfterMethod
	public void tearDown() throws InterruptedException, IOException
	{
		
		Thread.sleep(2000);
		Screenshot.screenshotMethod(driver);
			
		driver.quit();
		
	}
	
	
}
