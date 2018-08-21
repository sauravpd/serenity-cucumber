package pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8888/bank") 
public class LoginPage extends PageObject
{

	@FindBy(name = "username")
	private WebElement txtusername;

	@FindBy(name = "password")
	private WebElement txtpassword;

	@FindBy(xpath = ".//*[@type='submit']")
	private WebElement submitbtn;


	public void enter_username(String username) {

		txtusername.sendKeys(username);
	}

	public void enter_password(String password) {

		txtpassword.sendKeys(password);
	}

	public void clickLoginBtn() 
	{
		submitbtn.click();
	}
}
