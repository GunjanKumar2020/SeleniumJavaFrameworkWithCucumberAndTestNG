package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {".//features//login.feature"},

	 glue="stepsDefinition" ,
      plugin = {"pretty","html:target/cucumber-report.html"},
      monochrome = true)


public class TestRunner extends AbstractTestNGCucumberTests // This class must be extended when running runner class using TestNG
{                                                         // Also must add Cucumber TestNg dependency in Pom.xml
 
}
