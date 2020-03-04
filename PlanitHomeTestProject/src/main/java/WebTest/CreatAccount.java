package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;

import static WebTest.Utils.clickElements;

public class CreatAccount {

    private By _clickOnSignIn=By.xpath("//a[@class='login']");
    private By _enterEmail=By.xpath("//input[@id='email_create']");
    private By _clickOnCreateAcc=By.xpath("//form[@id='create-account_form']//span[1]");
    private By _errorMessage= By.xpath("//li[contains(text(),'An account using this email address has already be')] ");


    public void userClickOnSignIn()
    {
        clickElements(_clickOnSignIn);
       // enterText(_enterEmail);
        clickElements(_clickOnCreateAcc);
        Assert.assertEquals("An account using this email address has already been registered. Please enter a valid password or request a new one.\n",_errorMessage);
    }
}
