package stepDefinetions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarBikeHealthInsurance {
	@Given("I am on home page")
	public void i_am_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I am on home page");
	}

	@When("I click on carInsurance button")
	public void i_click_on_car_insurance_button() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("I click on carInsurance button");
	}

	@When("I provide valid RTO number and click on view quotes button")
	public void i_provide_valid_rto_number_and_click_on_view_quotes_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I provide valid RTO number and click on view quotes button");
	}

	@Then("I shoould get plan details")
	public void i_shoould_get_plan_details() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I shoould get plan details");
	}
	@When("I click on bikeInsurance button")
	public void i_click_on_bike_insurance_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I click on bikeInsurance button");

}
}
