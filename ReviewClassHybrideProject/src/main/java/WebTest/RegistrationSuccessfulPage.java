package WebTest;

import org.openqa.selenium.By;

public class RegistrationSuccessfulPage extends Utils {
    private By _registartionsuccess = By.xpath( "//div[@class=\"result\"]" );
    String expected = "Your registration completed";


    public void registrationSuccessful(){
        assertWithURL( "registerresult" );



    }
}
