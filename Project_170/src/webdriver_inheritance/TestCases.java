package webdriver_inheritance;

public class TestCases extends Repository
{
	Search_Flights Search;
	public void Tc001_Setup_browser()
	{
		
		Launch_browser("chrome");
		Search=new Search_Flights(driver);
		Load_Webpage(Search.Page_url);
		set_timeout(20);
		
	}
	
	
	public void Tc002_FlightSearch()
	{
		if(is_title_presented(Search.page_title))
		{
			System.out.println("title presented");
			Click_Element(Search.Roundtrip_Rbtn);
			Enter_text(Search.From_EB,Search.From_City_referral);
			Click_Element(Search.Hyd_City_Airport);
		}
		else
			System.out.println("Title not presented");
	}
	
	
	public void Close_Browser()
	{
		driver.close();
	}
	
	
	
	
	
	

}
