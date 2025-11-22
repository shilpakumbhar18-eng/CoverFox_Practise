package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//give feature file path
		features= {"C:\\Workspace\\New folder\\CoverFox_Practise\\src\\test\\resources\\CoverFoxFeatures\\coverFoxHealthInsurance.feature"
				   //"C:\\Workspace\\New folder\\CoverFox_Practise\\src\\test\\resources\\CoverFoxFeatures\\coverFoxCarBikeHealthInsurance.feature"
				   //"C:\\Workspace\\New folder\\CoverFox_Practise\\src\\test\\resources\\CoverFoxFeatures\\coverFoxMultipleTestData.feature"
				//"C:\\Workspace\\New folder\\CoverFox_Practise\\src\\test\\resources\\CoverFoxFeatures\\dataTable.feature"
		},
		//stepdefinations package name
		glue= {"stepDefinetions","hooks"},plugin= {"pretty","html:target/cucumber-reports/reports.html"},publish=true, dryRun=false
		)


public class HealthInsuranceRunner extends AbstractTestNGCucumberTests {
	//right click and run as testNG

}
