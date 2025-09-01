package misslaneous;

import java.util.Date;

import org.testng.annotations.Test;

public class CodeValidations {

	
	public static void generate() 
	{
		Date date=new Date();
		String emailID=date.toString().substring(4,17).replaceAll("[\s:]", "").concat("@hotmail.com");
	
		System.out.println(emailID);
		

	}

}
