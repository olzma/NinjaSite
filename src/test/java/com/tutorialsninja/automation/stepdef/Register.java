package com.tutorialsninja.automation.stepdef;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.config.ConfigurationReader;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import com.tutorialsninja.automation.framework.*;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.MyAccount;
import com.tutorialsninja.automation.pages.RegisterPage;

public class Register {
	
	public static RegisterPage regpage =new RegisterPage();//this is used for init of this page with the elements that we need
	public static HeadersSection elementofHeader =new HeadersSection();
	public static MyAccount mypage =new MyAccount();
		

	@Given("^I launch the application$")
	public void i_launch_the_application() throws InterruptedException  {
		//Browser.log.info("Open the address "+Base.reader.getUrl());
		
		Base.driver.get(Base.reader.getUrl());
		//Base.driver.navigate().refresh();
		
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
	   
		//Browser.log.info("Go to my Account Link from HeaderSection");
		Base.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Elements.click(HeadersSection.myAccountLink);
		
		
		//Browser.log.info("Click the register option from menu");
		
		Elements.click(HeadersSection.register);
		
	}

	@When("^I provide in all the bellow valid details$")
	public void i_provide_in_all_the_bellow_valid_details(DataTable dataTabel)  {
	 
		//Browser.log.info("Insert all the details info needed");
		Map<String,String> map=RegisterPage.enterAllDetails(dataTabel,"unique");
		
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		System.out.println("Plus the new email address: "+RegisterPage.allways_new_email);
	   	
	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy()  {
	    
		//Browser.log.info("Select the privacy policy");
		Elements.click(RegisterPage.privacyPolicy);
		
	}

	@And("^I click on Continue Button$")
	public void i_click_on_Continue_Button()  {
		
		//Browser.log.info("After fileds were filled in just click on Continue button");
		Elements.click(RegisterPage.continueButton);
	   
	}
	
	

	@Then("^I should see that the User account has been successfully created$")
	public void i_should_see_that_the_User_account_has_been_successfully_created() {
		
		//Browser.log.info("From newlly created account select the Success button");
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successAccountCreated));
	    	
	}
	
	@Then("^I should log out$")
	public void i_should_log_out()  {
	    
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(MyAccount.Logout);
		
	}
	
	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created() {
	   
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerPageLink)); //check that I am still on register page
		
	}

	@Then("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields()  {
	    
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lasNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainWarning));
			
	}

	@When("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() {
	   
		Elements.click(RegisterPage.subscribeYes);
		
	}
	
	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(DataTable dataTabel) throws InterruptedException  {

		Map<String,String> map=RegisterPage.enterAllDetails(dataTabel,"duplicate");
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		
		Thread.sleep(3000);
		
	}

	@Then("^I should see the warning message stating that the user is already created$") 
	public void i_should_see_the_warning_message_stating_that_the_user_is_already_created() throws InterruptedException{
		Thread.sleep(10000);
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainWarning,"Warning: E-Mail Address is already registered!"));
			
		}
		
	@Then("^I should close browser$")
	public void i_should_close_browser() throws InterruptedException {

		
		Base.driver.close();
		Thread.sleep(1000);
	}
	
}	
	
	
	
	
	

