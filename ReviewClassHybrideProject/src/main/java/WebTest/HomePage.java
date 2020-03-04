package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    LoadProp loadProp =new LoadProp();

    private By _electronic = By.xpath( "//div/h2/a[contains(. ,\" Electronics \")]" );
    private  By _detailsButton= By.xpath( "//div[2]/div/a[contains( . ,\"details\")]" );

    private By _registerButton = By.xpath( "//a[@class=\"ico-register\"]");
    private By _computer = By.linkText( "Computers" );
    private  By _jewelry = By.linkText("Jewelry");
    private  By _Apparel = By.linkText("Apparel");
    private  By _clothing = By.linkText("Clothing");


    // assert User on Home Page
    public  void userIsOnHomePage(){
        assertCurrentURLR( "https://demo.nopcommerce.com/" );
        System.out.println(" This is Home Page Ready for Operation Hahahahahahahah");
    }

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



    public void userNavigateToElectronicsPage(){
        //click electronic to navigate
        clickElement( _electronic );

    }


    public void userNavigatTonopCommerceNewsReleasePage(){
        // click on details for Write comment
        clickElement( _detailsButton );



    }


}
