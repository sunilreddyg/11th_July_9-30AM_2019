package framework.Datadriven.CSV_Files;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class Write_Data_Into_CSV_Files {

	public static void main(String[] args) throws IOException 
	{
		String filepath="src\\framework\\Datadriven\\CSV_Files\\output.csv";
		//Create output file
		FileWriter fw=new FileWriter(filepath);
		//Create object for Csv Writer
		CSVWriter writer=new CSVWriter(fw);
		
		//Runtime single dimensional array
		String header[]={"TestcaseID","Status"};
		writer.writeNext(header);
		
		//Runtime single dimensional array
		String line1[]={"Tc001_login","Pass"};
		writer.writeNext(line1);
		
	
		//Runtime single dimensional array
		String line2[]={"Tc002_login","Fail"};
		writer.writeNext(line2);
		
		writer.close();
		writer.flush();
	}

}
