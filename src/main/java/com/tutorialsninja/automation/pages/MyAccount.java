package com.tutorialsninja.automation.pages;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;
import net.bytebuddy.utility.RandomString;

public class MyAccount {
	
	public MyAccount(){
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	public static MyAccount mypage =new MyAccount();
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li//a[contains(text(),'Logout')]")  //a[contains(text(),'Logout')]
	public static WebElement Logout;
	
}
