package runner;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;

public class LoginStepScenario 
{
	@Steps
	LoginStep loginSteps ;

	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable 
	{
		loginSteps.open_home_page();
	}

	@Given("^I enter the following for Login$")
	public void i_enter_the_following_for_Login(DataTable table) throws Throwable 
	{
		List<String> data = table.asList(String.class);
		loginSteps.input_username(data.get(2));
		loginSteps.input_password(data.get(3));
	}

	@Given("^I click login button$")
	public void i_click_login_button() throws Throwable
	{
		loginSteps.click_on_login_btn();
	}

	@Then("^I click on logout$")
	public void i_click_on_logout() throws Throwable 
	{
		System.out.println("TODO");
	}
}
