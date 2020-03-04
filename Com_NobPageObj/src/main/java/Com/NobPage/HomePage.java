package Com.NobPage;


import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerButton = By.xpath( "//a[@class=\"ico-register\"]");
    private By _computer = By.linkText( "Computers" );
    private  By _jewelry = By.linkText("Jewelry");
    private  By _Apparel = By.linkText("Apparel");
    private  By _clothing = By.linkText("Clothing");

    //user click on register button for registation
    public void userClickOnRegister() {

        clickElement( _registerButton );

    }
    // User clik on Computer catagory button
    public void clickOnComputerCetagory(){
        clickElement( _computer );

    }
    // User clik on Jewelry  catagory button

    public void cliclOnJewelryButton(){
        clickElement( _jewelry );

    }
    //to move apparel page
    public void moveToApparelPageForClothing(){
        hoverElement( _Apparel );
        clickElement( _clothing );
    }

}

    //user click on rlickOnComputerCatagoryegister button for registation
    //user on home page
    //   driver.findElement( By.id( "register-button" ) ).click();
    // clickElement( By.id( "register-button" )  );

