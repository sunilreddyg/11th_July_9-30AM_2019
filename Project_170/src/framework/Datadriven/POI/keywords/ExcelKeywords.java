package framework.Datadriven.POI.keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelKeywords 
{
	
	public static String filepath="TestData\\";
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	/*
	 * Keyword:--> Target required Workbook and Sheet
	 * Author:-->	
	 */
	public static void getExcel_connection(String filename,String sheetname)
	{
		try {
			
			 fi=new FileInputStream(filepath+filename);
			 book=new XSSFWorkbook(fi);
			 sht=book.getSheet(sheetname);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	/*
	 * Keyword:-->Get String data from selected row and cell
	 * Author:-->	
	 */
	public static String getstring_celldata(int Rnum,int cellnum)
	{
		cell=sht.getRow(Rnum).getCell(cellnum);
		return cell.getStringCellValue();
	}
	
	/*
	 * Keyword:-->Get numeric data from selected row and cell
	 */
	public static int get_num_data(int Rnum,int cellnum)
	{
		cell=sht.getRow(Rnum).getCell(cellnum);
		Double Dvalue=cell.getNumericCellValue();
		return Dvalue.intValue();
	}
	
	/*
	 * Keyword:-->Get numeric data and convert into text format
	 */
	public static String get_num_to_text(int Rnum,int cellnum)
	{
		cell=sht.getRow(Rnum).getCell(cellnum);
		Double Dvalue=cell.getNumericCellValue();
		return NumberToTextConverter.toText(Dvalue);
	}
	
	
	/*
	 * Keyword:-->write cell data
	 * Author:-->	
	 */
	public static void write_celldata(int row, int cell, String result)
	{
		sht.getRow(row).createCell(cell).setCellValue(result);
	}
	
	/*
	 * Keyword:-->Create exce output file
	 * Author:-->	
	 */
	public static void Create_excel_output(String outputFilename)
	{
		try {
			
			book.write(new FileOutputStream(filepath+outputFilename));
			book.close(); //save data
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
