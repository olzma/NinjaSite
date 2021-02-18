package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.config.ConfigurationReader;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {

	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	  
		Base.driver.get(Base.reader.getUrl());
		
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
	   
	}

	@When("^I provide in all the bellow valid details$")
	public void i_provide_in_all_the_bellow_valid_details(DataTable arg1)  {
	 
	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy()  {
	    
	}

	@And("^I click on Continue Button$")
	public void i_click_on_Continue_Button()  {
	   
	}

	@Then("^I should see that the User account has been successfully created$")
	public void i_should_see_that_the_User_account_has_been_successfully_created() {
	    
	}
	
	
	
	
	
	
	
}
