Feature: Registration Functionality Validation

Scenario: Register with all mandatory fields

	Given user is on register page
	When user selects gender radio button
	And enters first name
	And enters last name 
	And enters email id
	And company name
	And enters password and confirm password
	And clicks on register button
	Then user should be resgistered successfully
	And confirmation message should be shown.