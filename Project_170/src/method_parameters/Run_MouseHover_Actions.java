package method_parameters;

import org.openqa.selenium.By;

public class Run_MouseHover_Actions 
{
	
	public static By Products_MainMenu=By.xpath("//a[@href='/personal/products']");
	public static By Cards_Products_submenu=By.xpath("//a[@href='/personal/products/cards']");
	public static By CreditCards_Cards_submenu=By.xpath("//a[@href='/personal/products/cards/credit_cards']");
	public static String url="https://www.hdfcbank.com/";
	
	
	public static  void main(String[] args) throws Exception 
	{
		//Create object for Repository
		Repository obj=new Repository();
		obj.Launch_browser("chrome");
		obj.Load_Webpage(url);
		obj.set_timeout(20);
		
		obj.MouseHover(Products_MainMenu);
		obj.MouseHover(Cards_Products_submenu);
		obj.Click_Element(CreditCards_Cards_submenu);
		
		
		
		

	}

}
