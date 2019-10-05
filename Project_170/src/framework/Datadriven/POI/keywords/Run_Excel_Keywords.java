package framework.Datadriven.POI.keywords;

public class Run_Excel_Keywords 
{

	public static void main(String[] args)
	{
		
		
		ExcelKeywords.getExcel_connection("InputData.xlsx", "Sheet3");
		
		for (int i = 5; i <= ExcelKeywords.sht.getLastRowNum(); i++) 
		{
			String UID=ExcelKeywords.getstring_celldata(i, 0);
			System.out.println(UID);
			
			ExcelKeywords.write_celldata(i, 2, "Testpass");
		}
		ExcelKeywords.Create_excel_output("New_OP.xlsx");
	
	}

}
