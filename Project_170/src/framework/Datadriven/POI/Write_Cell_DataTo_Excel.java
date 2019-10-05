package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Cell_DataTo_Excel 
{

	public static void main(String[] args) throws IOException {
		
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheetAt(0);
		
		//Write cell data into existing row and existing cell
		sht.getRow(1).getCell(2).setCellValue("Newpwd123");
		
		//Write Cell data into Existing row and new cell
		sht.getRow(1).createCell(6).setCellValue("Newcell");
		
		//Write cell data into new row and new cell
		sht.createRow(2).createCell(0).setCellValue("NewRow_And_NewCell");
	
		//Create new workbook
		FileOutputStream fo=new FileOutputStream("TestData\\OP.xlsx");
		//Write existing workbook data into new workbook
		book.write(fo);
		//Save and close excel
		book.close();
		
		
		
		
	}

}
