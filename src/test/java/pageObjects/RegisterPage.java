package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerLink;
	
	@FindBy(id="gender-male")
	private WebElement maleGenderRadioBtn;
	
	@FindBy(id="gender-female")
	private WebElement femaleGenderRadioBtn;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@type='email' and @name='Email']")
	private WebElement registerEmailTextField;
	
	@FindBy(id="Company")
	private WebElement companyTextField;
	
	@FindBy(xpath="//input[@type='password' and @name='Password']")
	private WebElement registerPasswordTextField;
	
	@FindBy(xpath="//input[@type='password' and @name='ConfirmPassword']")
	private WebElement registerConfirmPasswordTextField;
	
	@FindBy(xpath="//button[@type='submit' and @name='register-button']")
	private WebElement registerButton;
	
	@FindBy(xpath="//div[text()='Your registration completed']")
	private WebElement regConrmMsg;
	
	@FindBy(xpath="(//a[text()='My account'])[1]")
	private WebElement myAccountLink;
	
	
	public void clickOnRegisterLink()
	{
		registerLink.click();
	}
	
	public void selectMaleRadioButton()
	{
		maleGenderRadioBtn.click();
	}
	public void selectFemaleRadioButton()
	{
		femaleGenderRadioBtn.click();
	}
	
	public void registerFirstName(String firstName)
	{
		firstNameTextField.sendKeys(firstName);
	}
	
	public void registerLastName(String lastName)
	{
		lastNameTextField.sendKeys(lastName);
	}
	
	public void registerEmailID(String emailID)
	{
		registerEmailTextField.sendKeys(emailID);
	}
	
	public void registerCompanyName(String companyName)
	{
		companyTextField.sendKeys(companyName);
	}
	
	public void registerPassword(String password)
	{
		registerPasswordTextField.sendKeys(password);
	}
	
	public void registerConfirmPassword(String ConfirmPassword)
	{
		registerConfirmPasswordTextField.sendKeys(ConfirmPassword);
	}
	
	public void clickOnRegisterButton()
	{
		registerButton.click();
	}

	public String getRegistrationConfirmationMessage()
	{
		return regConrmMsg.getText();
	}
	
	public String verifyMyAccountLink()
	{
		return myAccountLink.getText();
	}
}
