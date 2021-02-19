package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersSection {

	public HeadersSection() { //this is needed so the WebElements to be initialize
		
		PageFactory.initElements(Base.driver, this);
		
	}
	public static HeadersSection elementofHeader =new HeadersSection();
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myAccountLink; 
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	
}
