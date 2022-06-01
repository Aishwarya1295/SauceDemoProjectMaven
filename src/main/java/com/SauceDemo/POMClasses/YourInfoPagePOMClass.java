package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInfoPagePOMClass 
{
	
	private WebDriver driver;
	
	//First name
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement Firstname;
	
	public void sendFirstname()
	{
		Firstname.sendKeys("Aishwarya");
	}
	
	//Last name 
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement Lastname;
	
	public void sendLastname()
	{
		Lastname.sendKeys("Bangale");
	}
	
	//Zipcode
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement Zipcode;
	
	public void sendZipcode()
	{
		Zipcode.sendKeys("411051");
	}
	
	//Cancel Button
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement CancelButton;
	
	public void clickCancelButton()
	{
		CancelButton.click();
	}
	
	//Continue Button
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
	public YourInfoPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
}
