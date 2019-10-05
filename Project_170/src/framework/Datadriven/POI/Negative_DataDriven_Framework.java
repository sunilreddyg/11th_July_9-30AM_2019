package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative_DataDriven_Framework 
{

	public static void main(String[] args) throws IOException, Exception
	{
		
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheetAt(4);
		
		//Get count of number of rows data available
		int Rcount=sht.getLastRowNum();
		
		

		//Set Runtime Property for chrome Driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//Launch browser and maximize window
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		//iterate for number of rows
		for (int i = 6; i <=Rcount; i++) 
		{
			
			//Get Execution Status
			String Exe_status=sht.getRow(i).getCell(6).getStringCellValue();
			
			//Condition to accept only selected rows
			if(Exe_status.equalsIgnoreCase("y"))
			{
				
				//Get Static Locations
				String Loc_Singin_btn=sht.getRow(6).getCell(1).getStringCellValue();
				String Loc_email=sht.getRow(6).getCell(2).getStringCellValue();
				String Loc_next_btn=sht.getRow(6).getCell(4).getStringCellValue();
				
				
				//Get Dynamic row data
				String Tcname=sht.getRow(i).getCell(0).getStringCellValue();
				String Input_email=sht.getRow(i).getCell(3).getStringCellValue();
				
				
				//Load URl
				String URL=sht.getRow(4).getCell(1).getStringCellValue();
				driver.get(URL); //Load webpage to browser
				
				//Click Signin button
				driver.findElement(By.xpath(Loc_Singin_btn)).click();
				Thread.sleep(3000);
				
				//Enter Email
				driver.findElement(By.xpath(Loc_email)).clear();
				driver.findElement(By.xpath(Loc_email)).sendKeys(Input_email);
				
				//Click next button
				driver.findElement(By.xpath(Loc_next_btn)).click();
				Thread.sleep(5000);
				
				
				//Get Expected Result
				String Exp_result=sht.getRow(i).getCell(5).getStringCellValue();
				//Get Scenrio type
				String Stype=sht.getRow(i).getCell(7).getStringCellValue();
				
				
				if(Stype.equals("text"))
				{
					//IDentifying page and capture entire page visible text.
					String VisibleText=driver.findElement(By.tagName("body")).getText();
					
					if(VisibleText.contains(Exp_result))
					{
						sht.getRow(i).createCell(8).setCellValue("Testpass");
						System.out.println(Tcname+"  "+"Testpass--> Error visible at webpage");
					}
					else
					{
						sht.getRow(i).createCell(8).setCellValue("TestFail");
						System.out.println(Tcname+"  "+"Testpass--> Error Not visible at webpage");
					}
					
				}
				
			}//if
			
			
			
			
		}//for
		

		//Create otuput file
		FileOutputStream fo=new FileOutputStream("TestData\\Neg_ouput.xlsx");
		//Write Existing workbook data to new workbook
		book.write(fo);
		//Save and Close Data
		book.close();
		
		
		

	}

}
