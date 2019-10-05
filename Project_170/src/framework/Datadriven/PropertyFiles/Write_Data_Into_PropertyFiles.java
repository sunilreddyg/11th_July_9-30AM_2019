package framework.Datadriven.PropertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_Into_PropertyFiles 
{

	public static void main(String[] args) throws IOException 
	{

		//Create object for property files
		Properties repository=new Properties();
		
		//Set Data at runtime
		repository.setProperty("Result1", "Testpass");
		repository.setProperty("Result2", "Testpass");
		repository.setProperty("Result3", "Testfail");
		repository.setProperty("Result4", "Testpass");
		
		//Create property file
		String filepath="src\\framework\\Datadriven\\PropertyFiles\\Output.properties";
		FileOutputStream fo=new FileOutputStream(filepath);
		//Write Runtime data to property file
		repository.store(fo, "Outlook_login");
		
	}

}
