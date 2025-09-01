package utilities;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomDetails 
{

	public static String generateName() 
	{
		RandomStringUtils random=new RandomStringUtils();
		String name=random.nextAlphabetic(6);
		return name;

	}
	
	public static String generateEmailID()
	{
		Date date=new Date();
		String emailID=date.toString().substring(4,17).replaceAll("[\s:]", "").concat("@hotmail.com");
		return emailID;
	}
	
	
}
