package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager 
{
	public static Properties prop;
	public static FileInputStream fis;
	
   static
   {
	   String propertyFilePath=".//src//test//resources//propertiesFile.properties";
	   try
	   {
	   prop=new Properties();
	   fis=new FileInputStream(propertyFilePath);
	   prop.load(fis);
	   }
	   catch(Exception e)
	   {
		   e.getMessage();
	   }
   }
}
