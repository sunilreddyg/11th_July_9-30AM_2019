package method_parameters;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{

	public WebDriver driver;
	public WebDriverWait wait;
	public String driver_path="chrome_driver\\";
	
	/*
	 * Keyword:--> Launch Browser [Firefox,Chrome,IE]
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Launch_browser(String browser_name)
	{
		switch (browser_name) 
		{
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", driver_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default:System.out.println("browser mismatch");
			break;
		}
		
	}
	
	

	/*
	 * Keyword:--> Load webpage
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Load_Webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Keyword:--> Set implicit and Explicit timeouts
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void set_timeout(int Time_in_sec)
	{
		driver.manage().timeouts().implicitlyWait(Time_in_sec, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, Time_in_sec);
	}
	
	
	
	/*
	 * Keyword:--> Method Helps to enter text into editbox
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Enter_text(String Ele_xpath,String Input)
	{
		driver.findElement(By.xpath(Ele_xpath)).clear();
		driver.findElement(By.xpath(Ele_xpath)).sendKeys(Input);
	}
	
	
	/*
	 * Keyword:--> Method Helps to enter text into editbox [Supports- pageobjects]
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Enter_text(By Locator,String Input)
	{
		WebElement TextBox=wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		TextBox.clear();
		TextBox.sendKeys(Input);
	}
	
	/*
	 * Keyword:--> Method Helps to enter text into editbox[Supports page-factory]
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Enter_text(WebElement Element,String Input)
	{
		WebElement Text_box=wait.until(ExpectedConditions.visibilityOf(Element));
		Text_box.clear();
		Text_box.sendKeys(Input);
	}
	
	

	/*
	 * Keyword:-->Selecting Dropdown Option
	 * Description:-->  Selection with Visibletext.[Optioname]
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Select_Dropdown(String ele_xpath,String option_name)
	{
		WebElement Dropdown_Element=driver.findElement(By.xpath(ele_xpath));
		new Select(Dropdown_Element).deselectByVisibleText(option_name);
	}
	
	/*
	 * Keyword:-->Selecting Dropdown Option
	 * Description:-->  Selection with Visibletext.[Optioname]
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Select_Dropdown(By Locator,String option_name)
	{
		WebElement Dropdown_Element=driver.findElement(Locator);
		new Select(Dropdown_Element).deselectByVisibleText(option_name);
	}
	
	/*
	 * Keyword:-->Selecting Dropdown Option [For Pagefactory class]
	 * Description:-->  Selection with Visibletext.[Optioname]
	 * Author:-->
	 * CreateOn:-->
	 * ReviewedBy:-->
	 * Last Updations:-->
	 * parameters used:-->
	 */
	public void Select_Dropdown(WebElement Element,String option_name)
	{
		WebElement Dropdown_Element=wait.until(ExpectedConditions.visibilityOf(Element));
		new Select(Dropdown_Element).selectByVisibleText(option_name);
	}
	
	/*
	 * Keyword Name:--> Click Any Element    [Button, List, checkbox, Radio button]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Click_Element(String element_xpath)
	{
		WebElement Clickable_element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element_xpath)));
		Clickable_element.click();
	}
	
	
	/*
	 * Keyword Name:--> Click Any Element    [Button, List, checkbox, Radio button]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Click_Element(By locator)
	{
		WebElement Clickable_element=wait.until(ExpectedConditions.elementToBeClickable(locator));
		Clickable_element.click();
	}
	
	
	
	/*
	 * Keyword Name:--> Click Any Element  [POM keyword]  [link, Button, List, checkbox, Radio button]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Click_Element(WebElement Element)
	{
		WebElement Clickable_element=wait.until(ExpectedConditions.elementToBeClickable(Element));
		Clickable_element.click();
	}
	
	/*
	 * MethodName:-->Mouse hover on element
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void MouseHover(By locator)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).moveToElement(Element).build().perform();
	}
	
	
	
	/*
	 * MethodName:-->Mouse hover on element  [POM elemnet]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void MouseHover(WebElement Element)
	{
		WebElement Visible_element=wait.until(ExpectedConditions.visibilityOf(Element));
		new Actions(driver).moveToElement(Visible_element).build().perform();
	}
	
	
	
	/*
	 * MethodName:-->ContextClick
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void RightClick_OnElement(By locator)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).contextClick(Element).perform();
	}
	
	
	
	/*
	 * MethodName:-->switch to window using window title
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void switchto_window(String window_title)
	{
		//Get all window dyamic id's
		Set<String> allwindows=driver.getWindowHandles();
				
		//Apply foreach loop ot iterate 
		for (String Eachwindow : allwindows) 
		{
			driver.switchTo().window(Eachwindow);
			//Get Current window at runtime
			String pagetitle=driver.getTitle();
					
			if(pagetitle.contains(window_title))
			{
				break;  //At what window title break iteration.It keep window controls on same window.
			}
				
		}	

	}
	
	
	
	/*
	 * MethodName:-->Capture Screenshot
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Capturescreen(String Imagename) 
	{
		//Java time stamp..
		DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Get System Data
		Date d=new Date();   //import java.util;
		//Using simple formatter change system data..
		String time=df.format(d);

		
		
		try {
			
			File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1, new File("screens\\"+time+Imagename+".png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
