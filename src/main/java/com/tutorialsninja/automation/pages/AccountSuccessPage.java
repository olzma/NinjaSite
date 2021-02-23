package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tutorialsninja.automation.base.Base;

public class AccountSuccessPage {
	
	
	@FindBy(xpath="//a[contains(text(),'Success')]")
	public static WebElement successAccountCreated ;
	
	public static AccountSuccessPage accountSuccess =new AccountSuccessPage(); //this is used for init of this page with the elements that we need
	
	public AccountSuccessPage() { //this is needed so the WebElements to be initialize
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	

}
