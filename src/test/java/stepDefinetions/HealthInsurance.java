package stepDefinetions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;

import com.CoverFox_Practise.DriverConfig.DriverFactory;
import com.CoverFox_Practise.Pages.CoverfoxAddressDetailsPage1;
import com.CoverFox_Practise.Pages.CoverfoxHealthPlanPage1;
import com.CoverFox_Practise.Pages.CoverfoxHomePage1;
import com.CoverFox_Practise.Pages.CoverfoxMemberDetailsPage1;
import com.CoverFox_Practise.Pages.CoverfoxResultPage1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthInsurance {
	CoverfoxAddressDetailsPage1 coverfoxAddressDetailsPage1=new CoverfoxAddressDetailsPage1(DriverFactory.getDriver());
	CoverfoxHealthPlanPage1 coverfoxHealthPlanPage1 =new CoverfoxHealthPlanPage1(DriverFactory.getDriver());
	CoverfoxHomePage1 coverfoxHomePage1 = new CoverfoxHomePage1(DriverFactory.getDriver());
	CoverfoxMemberDetailsPage1 coverfoxMemberDetailsPage1=new CoverfoxMemberDetailsPage1(DriverFactory.getDriver());
	CoverfoxResultPage1 coverfoxResultPage1 =new CoverfoxResultPage1(DriverFactory.getDriver());
	@Given("I am on hone page")
	public void i_am_on_hone_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I am on home page");
	   
	}

	@When("I click on Female button")
	public void i_click_on_female_button() throws InterruptedException {
	    Thread.sleep(4000);
	  System.out.println("I click on Female button");
	  coverfoxHomePage1.clickOnFemaleButton();
	}

	@When("I click on next button")
	public void i_click_on_next_button() throws InterruptedException {
		Thread.sleep(6000);
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I click on next button");
	    coverfoxHealthPlanPage1.clickOnNextButton();
	}

	@When("I provide age as {string} and click on next button")
	public void i_provide_age_as_and_click_on_next_button(String age) throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(7000);
		// Write code here that turns the phrase above into concrete actions
	   System.out.println("I provide as as "+age+" and click on next button");
	   coverfoxMemberDetailsPage1.clickOnAgeDropDown(age);
	   coverfoxMemberDetailsPage1.clickOnNextButton();
	   
	}

	@When("I provide pincode as {string} and mobNo as {string} and click on continue button")
	public void i_provide_pincode_as_and_mob_no_as_and_click_on_continue_button(String pincode, String mobNo) throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(8000);
		// Write code here that turns the phrase above into concrete actions
         System.out.println("I provide pincode as "+pincode+" and mobNo as "+mobNo+ "and click on continue button");
         coverfoxAddressDetailsPage1.enterZipCodeField(pincode);
         coverfoxAddressDetailsPage1.enterMobNoField(mobNo);
         coverfoxAddressDetailsPage1.clickOnContinueButton();
         //Assert.fail();
	}

	@Then("matching health insurance plans should be displayed as {string}")
	public void matching_health_insurance_plans_should_be_displayed_as(String results) throws InterruptedException {
		Thread.sleep(9000);
		// Write code here that turns the phrase above into concrete actions
	    System.out.println("matching health insurance plans should be displayed as "+results);
	   String actualResult =coverfoxResultPage1.getMatchingResultno();
	   Reporter.log("Actual result is "+actualResult,true);


	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

}