package stepsDefinition;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPage;

import utilities.GenerateRandomDetails;

public class RegisterSteps extends BaseSteps
{
	
	

	RegisterPage reg;
	
	
	@Given("user is on register page")
	public void user_is_on_register_page() throws InterruptedException 
	{
		 BaseSteps.setUp();
		 reg=new RegisterPage(driver);
			  
	     reg.clickOnRegisterLink();
	}

	@When("user selects gender radio button")
	public void user_selects_gender_radio_button() 
	{
		reg.selectMaleRadioButton();
	}

	@And("enters first name")
	public void enters_first_name() 
	{
		reg.registerFirstName(GenerateRandomDetails.generateName());
	}

	@And("enters last name")
	public void enters_last_name() 
	{
	    reg.registerLastName(GenerateRandomDetails.generateName());
	}

   @And("enters email id")
	public void enters_email_id() 
	{
	    reg.registerEmailID(GenerateRandomDetails.generateEmailID());
	}

	@And("company name")
	public void company_name() 
	{
	    reg.registerCompanyName("ABC");
	}

	@And("enters password and confirm password")
	public void enters_password_and_confirm_password() 
	{
	   reg.registerPassword("Test@12345");
	   reg.registerConfirmPassword("Test@12345");
	}

	@And("clicks on register button")
	public void clicks_on_register_button() 
	{
	   reg.clickOnRegisterButton();
	}

	@Then("user should be resgistered successfully")
	public void user_should_be_resgistered_successfully() 
	{
		String myAccountLinkText=reg.verifyMyAccountLink();
		Assert.assertEquals(myAccountLinkText, "My account");
	}

	@And("confirmation message should be shown.")
	public void confirmation_message_should_be_shown() 
	{
		String regconfirMMessage=reg.getRegistrationConfirmationMessage();
		Assert.assertEquals(regconfirMMessage, "Your registration completed");
		BaseSteps.tearDown();
	}


}
