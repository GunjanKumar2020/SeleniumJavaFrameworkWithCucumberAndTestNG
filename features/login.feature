Feature: Login Functionality validation 

Scenario: Login with valid credentials 
	Given user is on login page 
	When user enters valid emailId and valid password 
	And user clicks on login button 
	Then user should be logged in successfully 
	And user should see myAccountLink 
	
Scenario: Login with Invalid credentials 
	Given user is on login page 
	When user enters valid emailId and Invalid password 
	And user clicks on login button 
	Then user should see the error message 
	
Scenario: Login with Invalid credentials 
	Given user is on login page 
	When user enters Invalid emailId and valid password 
	And user clicks on login button 
	Then user should see the error message 
	
Scenario: Login with Invalid credentials 
	Given user is on login page 
	When user enters Invalid emailId and Invalid password 
	And user clicks on login button 
	Then user should see the error message 
	
Scenario: Login without credentials 
	Given user is on login page 
	When user clicks on login button
	Then user should see the error message 
	
	
	