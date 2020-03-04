package WebTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();

    @Given("^user is on login page$")
    public void userIsOnLoginPage() {
        logInPage.clickOnLogInButton();
        logInPage.verifyUserIsOnLogInPage();
    }

    @When("^user enter valid credential$")
    public void user_enter_valid_credential()  {
        logInPage.EnterLogInDetails();

    }

    @Then("^user should able to log in successfully$")
    public void user_should_able_to_log_in_successfully()  {
        logInPage.userLogInSuccessfully();

    }

}
