package WebTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {


    HomePage homePage = new HomePage();
    CreatAccount creatAccount = new CreatAccount();
    ContractUs contractUs = new ContractUs();
    AddToCart addToCart = new AddToCart();
    RemoveFromCart removeFromCart = new RemoveFromCart();

    @cucumber.api.java.en.Given("^user is on home page$")
    public void userIsOnHomePage() {
    }

    @When("^user click on contactUs$")
    public void user_click_on_contactUs() {
    }

    @When("^user select customer service$")
    public void user_select_customer_service() {
    }

    @When("^user enter email address$")
    public void user_enter_email_address() {
    }

    @When("^user enter text message$")
    public void user_enter_text_message() {
    }

    @When("^user click on send button$")
    public void user_click_on_send_button() {
    }

    @Then("^user can see message has been successfully sent$")
    public void user_can_see_message_has_been_successfully_sent() {
    }

    @When("^user click on singIn button$")
    public void user_click_on_singIn_button() {
    }

    @When("^user enter  already register email id$")
    public void user_enter_already_register_email_id() {
    }

    @When("^user click on creat an account button$")
    public void user_click_on_creat_an_account_button() {
    }

    @Then("^user can see the error messaage$")
    public void user_can_see_the_error_messaage() {
    }

    @When("^user click on item$")
    public void userClickOnItem() {
        
    }

    @And("^user select size$")
    public void userSelectSize() {
        
    }

    @And("^User select color$")
    public void userSelectColor() {
        
    }

    @And("^user click on add to cart$")
    public void userClickOnAddToCart() {
        
    }

    @Then("^user can see the message Product successfully added to your shopping cart$")
    public void userCanSeeTheMessageProductSuccessfullyAddedToYourShoppingCart() {
    }

    @When("^user click on cart$")
    public void userClickOnCart() {
        
    }

    @And("^user click on delete$")
    public void userClickOnDelete() {
        
    }

    @Then("^user can delet item successufully$")
    public void itemDeleteSuccessfullyFromCart() {
    }

}
