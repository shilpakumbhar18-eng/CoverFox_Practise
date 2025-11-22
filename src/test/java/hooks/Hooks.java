package hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.CoverFox_Practise.DriverConfig.DriverFactory;
import com.CoverFox_Practise.Utils.Utility;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	@Before()
	public void launchBrowser() throws IOException
	{
		DriverFactory.initBrowser(Utility.readDataFromPropertiesFile("browser"));
	}
	@After(order=1)
	public void tearDown()
	{
		DriverFactory.getDriver().quit();
		Reporter.log("closing browser",true);
	}
	@After(order=2)
	public void takeScreenshot(Scenario scenario)
	{
		 boolean result = scenario.isFailed();
		 if(result)
		 {
		  byte[] ss = ( (TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
		    scenario.attach(ss, "image/png", scenario.getName());
		  Reporter.log("Taking screenshot", true);
		 }
		
	}
	
	
}
