package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	
	private WebDriver driver;
	
	//Username
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement UserName;
	
	public void SendUsername()
	{
		UserName.sendKeys("standard_user");
	}
	
	//Password
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	public void SendPassword()
	{
		Password.sendKeys("secret_sauce");
	}
	
	//LoginButton
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement LoginButton;
	
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
	
	//constructor declare
	
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
