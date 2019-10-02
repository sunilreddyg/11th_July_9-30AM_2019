package webdriver_inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Search_Flights 
{
	
	public Search_Flights(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using="OneWay") 
	public WebElement Oneway_Rbtn;
	
	@FindBy(how=How.ID,using="RoundTrip")
	public WebElement Roundtrip_Rbtn;
	
	@FindBy(xpath="//input[@id='MultiCity']")
	public WebElement Multiple_Trip_Rbtn;
	
	@FindBy(xpath="//div[@id='homeErrorMessage']")
	public WebElement Home_error_msg;
	
	@FindBy(xpath = "//h1[contains(.,'Search flights')]")
	public WebElement Page_header;
	
	@FindBy(how=How.XPATH,using="//strong[contains(.,'One way')]")
	public WebElement Oneway_Rbtn_label;
	
	@FindBy(xpath = "(//strong[contains(.,'Round trip')])[1]")
	public WebElement Roundtrip_Rbtn_Label;
	
	@FindBy(xpath = "//input[@id='FromTag']")
	public WebElement From_EB;
	
	@FindBy(xpath = "//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")
	public WebElement Hyd_City_Airport;
	
	@FindBy(xpath = "//input[@id='ToTag']")
	public WebElement Arrival_EB;
	
	@FindBy(xpath = "//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")
	public WebElement Delhi_City_Airport;
	
	@FindBy(xpath = "//input[@id='SearchBtn']")
	public WebElement Flight_Search_btn;
	
	//InputData
	public String Exp_page_header="Search flights";
	public String Exp_home_err_msg="Sorry, but we can't continue until you fix everything that's marked in RED";
	public String Page_url="https://www.cleartrip.com/";
	public String page_title="#1 Site for Booking Flights";
	public String From_City_referral="HYD";
	/*
	 * Reusable method:--> Verify Page Header displayed at webpage
	 */
	public void Verify_Page_Header_Visibility()
	{
		 if(Page_header.isDisplayed())
			 System.out.println("header visible at webpage");
		 else
			 System.out.println("header not visible at webpage");
		
	}
	
	
	//Reusable Method:--> Verify Expected Header visible at webpage
	public void Verify_Expected_Header_Visibility()
	{
		String Runtime_Header_text=Page_header.getText();
		if(Runtime_Header_text.equals(Exp_page_header))
			System.out.println("Expected Header visible at webpage");
		else
			System.out.println("Expected Header not visible at webpage");
	}
	
	
	//reusable method:--> verify home error message displayed 
	public void Verify_Home_error_msg_displayed_on_Empty_Search()
	{
		String Runtime_text=Home_error_msg.getText();
		if(Runtime_text.contains(Exp_home_err_msg))
			System.out.println("As expected error msg displayed at webpage");
		else
			System.out.println("Expected home error message displayed at webpage");
	}
	
	
}
