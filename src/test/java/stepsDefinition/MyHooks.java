package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepsDefinition.BaseSteps;

public class MyHooks extends BaseSteps
{
	@Before
	public void launchBrowser()
	{
		setUp();
	}
	
	@After
	public void closeBrowser()
	{
		tearDown();
	}

}
