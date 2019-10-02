package webdriver_inheritance;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
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
	
	
	/*
	 * Keywordname:--> Method verify title presented at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public boolean is_title_presented(String exp_title)
	{
		//Get Runtime Title
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(exp_title);
		return flag;
	}
	
	
	/*
	 * MethodName:--> Verify url presented at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public boolean isUrl_Presented(String Exp_Url)
	{
		try {
			wait.until(ExpectedConditions.urlContains(Exp_Url));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
		
	}
	
	
	
	/*
	 * MethodName:--> Method verify text visible at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	
	public boolean isText_visibleAt_Webpage(String Exp_text)
	{
		//Target page 
		WebElement Webpage=driver.findElement(By.tagName("body"));
		//Capture page visible text
		String page_visible_text=Webpage.getText();
		//Verify Expected text visible at webpage
		boolean flag=page_visible_text.contains(Exp_text);
		return flag;
	}
	
	
	
	/*
	 * MethodName:--> Method verify Alert presented at webpage and return boolean value
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public boolean isAlert_presented()
	{
		
		try {
			driver.switchTo().alert();
			return true;
			
		} catch (NoAlertPresentException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	
	/*
	 * MethodName:--> Accept or dismiss alert window
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public void CloseAlert()
	{
		if(isAlert_presented())
		{
			driver.switchTo().alert().accept();
		}
	
	}
	
	
	/*
	 * MethodName:--> get Alert text
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public String get_alert_text()
	{
		String Runtime_alert_text = null;
		if(isAlert_presented())
		{
			Runtime_alert_text=driver.switchTo().alert().getText();
		}
		return Runtime_alert_text;
	}
	

	/*
	 * MethodName:--> Method return selected row and cell value [From static table]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public WebElement Get_Static_Webtable_Cell(String TableXpath,int Row, int Cell)
	{
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath(TableXpath));
		
		//Find number of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Target Required row
		WebElement SelectedRow=rows.get(Row);
		
		//using selected row find list of cells
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Target Required Cell
		WebElement Webtable_cell=cells.get(Cell);
		
		return Webtable_cell;
	}
	
	
	
	
	/*
	 * MethodName:--> Method return selected Record referal cell [From Dynamic table]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	
	public WebElement Get_Dynaic_Webtable_Cell(String TableXpath, String Recordname,int Cell)
	{
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath(TableXpath));
		
		//Find number of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		boolean flag=false;
		WebElement Webtable_Cell = null;
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//target Each Dynamic row at table
			WebElement DynamicRow=rows.get(i);
			
			//Capture text on Each Row
			String RowText=DynamicRow.getText();
			
			//Accept Condition where any record match in dynamic row
			if(RowText.contains(Recordname))
			{
				flag=true;
				System.out.println("Row Number is => "+i);
				
				//using Dynamic row find List of Cells
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Target Required Cell
				Webtable_Cell=cells.get(Cell);
				break;  //stop Iteration
				
			}
		}//for
		
		 System.out.println("Record avaiable status is => "+flag);
		 return Webtable_Cell;
		
	}//Method
	
	
	public void Close_browser()
	{
		try {
			driver.close();
			System.out.println("From Parent class");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	
	
}
