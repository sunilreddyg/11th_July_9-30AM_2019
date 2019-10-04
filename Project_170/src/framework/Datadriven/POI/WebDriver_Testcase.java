package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Testcase {

	public static void main(String[] args) throws Exception {
		
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheetAt(1);
		
		//Target row using sheet referal
		XSSFRow row=sht.getRow(1);
		
		
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			
		//Get url from excel
		String URL=row.getCell(1).getStringCellValue();

		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		//Get Singin button xpath from excel
		String Loc_Signin_nav_btn=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(Loc_Signin_nav_btn)).click();
		
		//Get Email xpath and Inputdata from excel
		String Loc_Email_EB=row.getCell(3).getStringCellValue();
		String IP_Email_EB=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Loc_Email_EB)).clear();
		driver.findElement(By.xpath(Loc_Email_EB)).sendKeys(IP_Email_EB);
		
		//Email Next button form excel
		String Loc_next_btn=row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(Loc_next_btn)).click();
	}

}
