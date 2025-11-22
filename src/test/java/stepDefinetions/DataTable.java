package stepDefinetions;

import java.util.List;

import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable {
	@Given("I am on home page1")
	public void i_am_on_home_page1() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I am on home page1");
	}

	@When("I provide username and password")
	public void i_provide_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		  List<List<String>> testListData = dataTable.asLists();
		  List<String> user1 = testListData.get(1);
		   String username1 = user1.get(0);
		   String pswd1 = user1.get(1);
		   String msg1 = user1.get(2);
		   Reporter.log(username1, true);
		   Reporter.log(pswd1, true);
		   Reporter.log(msg1, true);
	    
	}

	@Then("I should navigate to inbox")
	public void i_should_navigate_to_inbox() {
	   System.out.println("I should navigate to inbox");
	}


	

	}


