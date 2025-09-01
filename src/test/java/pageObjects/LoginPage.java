package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginLink;
	
	
		
	@FindBy(xpath="//input[@class='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@class='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement rememberCheckBox;
	
	@FindBy(xpath="//button[@type='submit' and @class='button-1 login-button']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[text()='Login was unsuccessful. Please correct the errors and try again.']/ul/li")
	private WebElement loginErrorMsg;
	
	@FindBy(xpath="//span[@id='Email-error']")
	private WebElement emptyEmailErrorMsg;
	
	
	
	// Define the methods to perform the actions on above web elements.
	
		
	
	// Login fields methods defined below
	
	public void clickOnLoginLink()
	{
		loginLink.click();
	}

	public void enterLoginEmailID(String emailID)
	{
		emailTextField.sendKeys(emailID);
	}
	
	public void enterLoginPassword(String password)
	{
		passwordTextField.sendKeys(password);
	}
	
	public void selectRememberCheckBox()
	{
		rememberCheckBox.click();
	}
	
	public void clickOnLoginButton()
	{
		loginBtn.click();
	}
	
	public String getErrorMessage()
	{
		return loginErrorMsg.getText();
	}
	public String getErrorMessageForEmptyEmail()
	{
		return emptyEmailErrorMsg.getText();
	}
}
