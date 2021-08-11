package testSuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_page;

public class Loginstep
{
	Login_page lop=new Login_page();
	
	@Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable
	{
        lop.openUrl();
    }

    @When("^enter valid email and pwd and click login$")
    public void enter_valid_email_and_pwd_and_click_login() throws Throwable
    {
       lop.validLogin();
    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login() throws Throwable
    {
    	lop.loginSucess();
    }
}
