package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    private By _firstName = By.xpath("//input[@id=\"FirstName\"]");//id( "FirstName" ) ;
    private By _lastName = By.xpath( "//input[@id=\"LastName\"]" );//id( "LastName" );
    private By _email = By.id( "Email" );
    private By _password = By.id( "Password" );
    private  By _confirmPassword =By.id( "ConfirmPassword" );
    private  By _registerButton = By.id( "register-button");
    public static String timestamp = currentTimeStamp();


    private String firstName="Mr sorry";
    private String lastName="ImFine";

    //Assert user on registration page
    public void veryfyUserOnRegistrationPage(){
        String CurrentURL=driver.getCurrentUrl();
        Assert.assertEquals(CurrentURL,"https://demo.nopcommerce.com/register?returnUrl=%2F" );

    }
    public void userEnterDetails(){

        enterText( _firstName,firstName );

        enterText( _lastName,lastName );

        enterText( _email,"mrsaorynp"+timestamp+ "@yahoo.com" );

        enterText( _password,"aaa123" );

        enterText( _confirmPassword,"aaa123" );

        clickElement( _registerButton );
        System.out.println("Done");

    }

}
