package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass 
{
	
	private WebDriver driver;
	private Actions act;	
	
	//Remove Product Button
	
	@FindBy(xpath="(//button[text()='Remove'])[1]")
	private WebElement removeButton;
	
	public void ClickRemoveButton()
	{
		removeButton.click();
	}
	
	//Continue Button
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement ContinueButton;
	
	public void clickContinueButton()
	{
		ContinueButton.click();
	}
	
	//Checkout Button
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkoutButton;
	
	public void clickCheckout()
	{
		act.click(checkoutButton).perform();
	}
	
	public CartPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	
}
