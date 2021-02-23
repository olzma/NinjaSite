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

public class RegisterPage {
	
	public static String allways_new_email="";
	
	public RegisterPage() { //this is needed so the WebElements to be initialize
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	public static RegisterPage regpage =new RegisterPage();//this is used for init of this page with the elements that we need



	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement continueButton;
	
	@FindBy(linkText="Register")
	public static WebElement registerPageLink;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstNameWarning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static  WebElement lasNameWarning;
	
	@FindBy(css="input[id='input-email']+div")
	public static  WebElement emailWarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static  WebElement telephoneWarning;
	
	@FindBy(css="input[id='input-password']+div")
	public static  WebElement passwordWarning;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	public static  WebElement mainWarning;
	
	public static Map enterAllDetails(DataTable dataTabel, String details) {
		
		Map<String,String> map = dataTabel.asMap(String.class,String.class);
		Elements.TypeText(RegisterPage.firstName,map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastName,map.get("LastName"));
		
		Elements.TypeText(RegisterPage.telephone,map.get("Telephone"));
		Elements.TypeText(RegisterPage.password,map.get("Password"));
		Elements.TypeText(RegisterPage.confirmPassword,map.get("Password"));
		
		allways_new_email=RandomString.make(5)+map.get("Email");
		
		if(details.equalsIgnoreCase("duplicate")) {
			Elements.TypeText(RegisterPage.email, map.get("Email"));
		}else
			Elements.TypeText(RegisterPage.email,allways_new_email);
			
		return map;
	}
	
	
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement subscribeYes;
	
	
	
}
