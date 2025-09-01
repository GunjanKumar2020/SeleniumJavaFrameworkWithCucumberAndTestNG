package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ConfigManager;

public class BaseSteps 
{
 public static WebDriver driver;
 
  public static void setUp()
  {
	  driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get(ConfigManager.prop.getProperty("appURL"));
  }
  
  public static void tearDown()
  {
	  if(driver!=null)
	  {
		  driver.quit();
	  }
  }
}
