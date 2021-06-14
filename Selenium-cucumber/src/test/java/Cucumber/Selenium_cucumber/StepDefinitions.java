package Cucumber.Selenium_cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

	@Given("I want to logging to page")
	public void i_want_to_logging_to_page() {
		
		System.out.println("loggin to the welcome page");
	   
	}

	@When("I provided {string} and {string}")
	public void i_provided_and(String string, String string2) {
	    
		System.out.println("Eneter the valid USername and Password");
	}

	@When("i will click on loggin button")
	public void i_will_click_on_loggin_button() {
		
		System.out.println("Loggin button has been clicked");
	   
	}

	@Then("i will be able to loggin to next page.")
	public void i_will_be_able_to_loggin_to_next_page()
	{
		System.out.println(" i am in te next page ");
		   }
	
	
	@Given("I want to see")
	public void i_want_to_see() {
		System.out.println(" seee ");
	}

	@When("i will validate")
	public void i_will_validate() {
		System.out.println(" Validate page ");
	}
	@Then("i will  not able to loggin to next page with Error.")
	public void i_will_not_able_to_loggin_to_next_page_with_error() {
		System.out.println(" i am in te same page ");
	}
	
	
}




