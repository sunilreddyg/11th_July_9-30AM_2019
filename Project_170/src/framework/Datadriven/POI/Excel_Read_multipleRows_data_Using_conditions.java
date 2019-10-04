package framework.Datadriven.POI;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_multipleRows_data_Using_conditions {

	public static void main(String[] args) throws Exception {
		
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheet("Sheet4");
		
		//Get Number of rows data available at excel.
		int Row_count=sht.getLastRowNum();
		System.out.println("Data available in number of rows is =>"+Row_count);
		
		//Iterate for expected range
		for (int i = 5; i <= Row_count; i++) 
		{
			XSSFRow DynamicRow=sht.getRow(i);
			
			//Get Execution status
			String Exe_status=DynamicRow.getCell(2).getStringCellValue();
			
			//Accept Iteration when execution status return "Y"
			if(Exe_status.equalsIgnoreCase("y"))
			{
				//Get static Cell values
				String UID=DynamicRow.getCell(0).getStringCellValue();
				String PWD=DynamicRow.getCell(1).getStringCellValue();
				
				System.out.println(UID+"   "+PWD);
				
				//Get scenario status
				String Scenario_type=DynamicRow.getCell(3).getStringCellValue();
				
				if(Scenario_type.equals("text"))
				{
					System.out.println("captured Element text");
				}
				else if(Scenario_type.equals("object"))
				{
					System.out.println("verified element visible");
				}
				else if(Scenario_type.equals("alert"))
				{
					System.out.println("Alert handled");
				}
				else
					System.out.println("Scenario type is mismatch");
			}
			
		
		}

	}

}
