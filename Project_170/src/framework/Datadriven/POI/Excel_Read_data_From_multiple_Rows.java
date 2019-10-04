package framework.Datadriven.POI;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_data_From_multiple_Rows 
{

	public static void main(String[] args) throws Exception 
	{
		
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//Get Number of rows data available at excel.
		int Row_count=sht.getLastRowNum();
		System.out.println("Data available in number of rows is =>"+Row_count);
		
		//Iterate for expected range
		for (int i = 5; i <= Row_count; i++) 
		{
			XSSFRow DynamicRow=sht.getRow(i);
			
			//Get static Cell values
			String UID=DynamicRow.getCell(0).getStringCellValue();
			String PWD=DynamicRow.getCell(1).getStringCellValue();
			
			System.out.println(UID+"   "+PWD);
		
		}

	}

}
