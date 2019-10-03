package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws IOException
	{
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
	
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using workbook
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Get row using above sheet referral
		XSSFRow row=sht.getRow(1);
		
		//Get cell using row referral
		XSSFCell cell=row.getCell(0);
		
		//get String value from cell
		String URL=cell.getStringCellValue();
		System.out.println("Application url is => "+URL);
		
		
		//Using row referral get first cell value
		String CID=row.getCell(1).getStringCellValue();
		System.out.println("User ID is => "+CID);
		
		
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		

	}

}
