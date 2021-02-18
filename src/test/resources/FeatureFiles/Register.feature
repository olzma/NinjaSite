Feature: Registration functionality scenarios

@Register
Scenario: Register into applications by providing all the fields
	Given I launch the application 
	And I navigate to Account Registration page
	When I provide in all the bellow valid details
		|FirstName |	Ravi								 |
		|LastName  |	Kiran								 |
		|Email	   |	ravi.kiran2@gmail.com|
		|Telephone | 0834343434						 |
		|Password	 | rkiran								 |
	And I select the Privacy Policy
	And I click on Continue Button
	Then I should see that the User account has been successfully created
	
Scenario: Check something	

