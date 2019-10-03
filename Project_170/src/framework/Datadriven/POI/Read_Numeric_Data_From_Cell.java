package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Numeric_Data_From_Cell {

	public static void main(String[] args) throws IOException 
	{
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheetAt(0);
		
		//Using sheet referral target row & cell
		Double PWD_In_Double_Formt=sht.getRow(1).getCell(2).getNumericCellValue();
		
		//Print value in double format[Get numeric value return number in double format]
		System.out.println("PWD in double format is => "+PWD_In_Double_Formt);
		
		//Convert Double format into Int format.
		int PWD_In_int_format=PWD_In_Double_Formt.intValue();
		System.out.println("PWD in integer format is => "+PWD_In_int_format);
		
		//Convert Double format value into Text format
		String PWD_In_String_Format=NumberToTextConverter.toText(PWD_In_Double_Formt);
		System.out.println("PWD in String format is => "+PWD_In_String_Format);
		
		
		
		//Get Mobile number from cell
		Double Mobile_In_Double_Fmt=sht.getRow(1).getCell(3).getNumericCellValue();
		System.out.println("Mobile number in double format is => "+Mobile_In_Double_Fmt);
		
		//Convert double format into long format
		long Mobile_in_long_fmt=Mobile_In_Double_Fmt.longValue();
		System.out.println("Mobile number in long format  is => "+Mobile_in_long_fmt);
		
		//Convert double format value to text
		String Mobile_in_String_fmt=NumberToTextConverter.toText(Mobile_In_Double_Fmt);
		System.out.println("Mobile number in String format => "+Mobile_in_String_fmt);
		
		
		//Read alternate mobile number
		String Alternate_mobile=sht.getRow(1).getCell(5).getStringCellValue();
		System.out.println("Alternate mobile number is => "+Alternate_mobile);
		
		
	}

}
