package steps;

import common.AmazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonPage;

public class LoginToAmazonAccount extends AmazonBase{

	AmazonPage ap;
	
	
	@Given("I an on the amazon homepage")
	public void i_an_on_the_amazon_homepage() {
	   
		lunchBrowser();
	}

	@When("i click on the sign in button")
	public void i_click_on_the_sign_in_button() {
		
		ap = new AmazonPage(driver);
		ap.clickingOnSignInbutton();
	}

	@When("I enter the {string} in input field")
	public void i_enter_the_in_input_field(String User_Name) {
		ap = new AmazonPage(driver);
		ap.enrerEmailAddress(User_Name);
		
	}

	@When("i enter the {string} in password input field")
	public void i_enter_the_in_password_input_field(String password) {
		
		ap = new AmazonPage(driver);
		ap.enterpassword(password);
	   
		
	}

	@Then("ican successfully login to my amazon account")
	public void ican_successfully_login_to_my_amazon_account() {
	   
		
	}
}
