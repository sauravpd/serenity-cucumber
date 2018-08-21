package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

public class LoginStep extends ScenarioSteps
{
	private static final long serialVersionUID = 1L;
	LoginPage loginPage;

	@Step
	public void open_home_page() 
	{
		loginPage.open();
	}

	@Step
	public void input_username(String username) 
	{
		loginPage.enter_username(username);
	}

	@Step
	public void input_password(String password) 
	{
		loginPage.enter_password(password);
	}
	
	@Step
	public void click_on_login_btn() 
	{
		loginPage.clickLoginBtn();
	}

}
