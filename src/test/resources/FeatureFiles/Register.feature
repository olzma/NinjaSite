Feature: Registration functionality scenarios

@Register @One
Scenario: Register into applications by providing all the fields
	Given I launch the application 
	And I navigate to Account Registration page
	When I provide in all the bellow valid details
		|FirstName |	Ravi								 |
		|LastName  |	Kiran								 |
		|Email	   |	ravi.kiran2xx@gmail.com|
		|Telephone | 0834343434						 |
		|Password	 | rkiran								 |
	And I select the Privacy Policy
	And I click on Continue Button
	Then I should see that the User account has been successfully created
	And I should log out
	#And I should close browser
	
@Register @Two
 Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
  	Given I launch the application
  	And I navigate to Account Registration page
  	When I click on Continue Button
  	Then I should see that the User Account is not created
  	And I should see the error messages informing the user to fill the mandatory fields
  	#And I should close browser

@Register @Three
Scenario: Verify whether the user is able to register into application by opting for Nwesletter subscriptions
	Given I launch the application 
	And I navigate to Account Registration page
	When I provide in all the bellow valid details
		|FirstName |	Ravi								 |
		|LastName  |	Kiran								 |
		|Email	   |	ravi.kiran2xx@gmail.com|
		|Telephone | 0834343434						 |
		|Password	 | rkiran								 |
	And I select the Privacy Policy
	And I subscribe to Newsletter
	And I click on Continue Button
  Then I should see that the User account has been successfully created
  And I should log out
  #And I should close browser
  
  
 @Register @Four
 Scenario: Verify whether the user is restricted from registring a duplicate account
  	Given I launch the application
  	And I navigate to Account Registration page
  	When I provide the below duplicate details into the fields
  		| FirstName | Ravi 									|
    	| LastName  | Kiran 								|
    	| Email		| Ravi.kiran1@gmail.com 	|
    	| Telephone	| 9212345678						|
    	| Password	| rkiran								|
    And I select the Privacy Policy
    And I click on Continue Button
	 Then I should see the warning message stating that the user is already created 