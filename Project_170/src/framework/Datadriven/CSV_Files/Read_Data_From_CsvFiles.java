package framework.Datadriven.CSV_Files;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;

public class Read_Data_From_CsvFiles {

	public static void main(String[] args) throws IOException
	{
		
		String filepath="src\\framework\\Datadriven\\CSV_Files\\TestData.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		
		//Create object for csv files
		CSVReader reader=new CSVReader(fr);
		
		//Read header
		String Header[]=reader.readNext();
		System.out.println(Header[0]+"     "+Header[1]);
		
		//Read first line data
		String Line1[]=reader.readNext();
		System.out.println(Line1[0]+"    "+Line1[1]);
		
		
		String Rline[];
		while((Rline=reader.readNext())!=null)
		{
			System.out.println(Rline[0]+"   "+Rline[1]);
		}

	}

}
