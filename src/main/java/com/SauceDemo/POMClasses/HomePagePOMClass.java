package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{
	
	private WebDriver driver;
	
	//Filter DropDown
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement FilterDropdown;
	private Select s;
	
	public String getFilterText()
	{
		String FilterText = FilterDropdown.getText();
		
		return FilterText;
	}
	
	public void applyFilter()
	{
		
		FilterDropdown.click();
		
		s.selectByVisibleText("Name (Z to A)");
	}
	
	//Add products 3 products only
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> Allproducts;
	
	public void addProducts()
	{
		for(int i=0 ; i<=2 ; i++)
		{
			Allproducts.get(i).click();
		}
		
	}
	
	//Add Single Product
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement SingleProducts;
		
	public void addSingleProduct()
	{
		SingleProducts.click();
	}

	//Cart Button
	
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	private WebElement CartButton;
	
	public String getCartText()
	{
		String CartText = CartButton.getText();
		return CartText;
	}
	
	public void clickOnCart()
	{
		CartButton.click();
	}
	
	//Hamburger Menu
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement HamburgerButton;
	
	public void clickHamburger()
	{
		HamburgerButton.click();
	}
	
	//About Menu
	
	@FindBy(xpath="//a[text()='About']")
	private WebElement AboutMenu;
	
	public void clickAbout()
	{
		AboutMenu.click();
	}
	
	//Logout Button
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement LogoutButton;
	
	public void clickLogoutButton()
	{
		LogoutButton.click();
	}
	
	//Constructor
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		s = new Select(FilterDropdown);
	}
	

}
