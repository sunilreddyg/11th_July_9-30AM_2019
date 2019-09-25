package pageobjects.With_Resuable_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Registration
{

	public FB_Registration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement Firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement Surname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	WebElement Email_or_Mobile;
	
	@FindBy(xpath = "//input[@aria-label='Re-enter email address']")
	WebElement Retype_mobile;
	
	@FindBy(xpath = "//input[@data-type='password']")
	WebElement Password;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	WebElement DOB_Day;
	
	@FindBy(xpath = "//select[@title='Month']")
	WebElement DOB_Month;
	
	@FindBy(css="#year")
	WebElement DOB_year;

}
