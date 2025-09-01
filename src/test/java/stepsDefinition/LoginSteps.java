package stepsDefinition;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utilities.ConfigManager;


public class LoginSteps extends BaseSteps
{
	public  LoginPage loginPage;
	public RegisterPage reg;
	  
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		  loginPage=new LoginPage(driver);
		  loginPage.clickOnLoginLink();
	}
	@When("user enters valid emailId and valid password")
	public void user_enters_valid_email_id_and_valid_password()
	{
		loginPage.enterLoginEmailID(ConfigManager.prop.getProperty("emailID"));
		loginPage.enterLoginPassword(ConfigManager.prop.getProperty("password"));
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button()
	{
		loginPage.clickOnLoginButton();
	}
	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() 
	{
	   
	}
	@And("user should see myAccountLink")
	public void user_should_see_my_account_link() 
	{
		RegisterPage reg=new RegisterPage(driver);
		String myAccountLinkText=reg.verifyMyAccountLink();
		Assert.assertEquals(myAccountLinkText, "My account");
	}
	
	@When("user enters Invalid emailId and Invalid password")
	public void user_enters_invalid_email_id_and_invalid_password() 
	{
		loginPage.enterLoginEmailID(ConfigManager.prop.getProperty("inValidEmailID"));
		loginPage.enterLoginPassword(ConfigManager.prop.getProperty("inValidPassword"));
	}
	
	@Then("user should see the error message")
	public void user_should_see_the_error_message()
	{
		String errorMessage=loginPage.getErrorMessage();
		Assert.assertEquals(errorMessage,"No customer account found");
	}
	
	
	@When("user enters valid emailId and Invalid password")
	public void user_enters_valid_email_id_and_invalid_password() 
	{
		loginPage.enterLoginEmailID(ConfigManager.prop.getProperty("emailID"));
		loginPage.enterLoginPassword(ConfigManager.prop.getProperty("inValidPassword"));
	}
	
	
	
	@When("user enters Invalid emailId and valid password")
	public void user_enters_invalid_email_id_and_valid_password() 
	{
		loginPage.enterLoginEmailID(ConfigManager.prop.getProperty("inValidEmailID"));
		loginPage.enterLoginPassword(ConfigManager.prop.getProperty("password"));
	}
	
	

	
	
	

	
	
}
