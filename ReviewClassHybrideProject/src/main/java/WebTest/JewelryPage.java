package WebTest;

import org.openqa.selenium.By;

public class JewelryPage extends Utils {
    private By _product1 = By.linkText("Elegant Gemstone Necklace (rental)");
    private  By _addcompare1 = By.xpath( "//input[contains(@onclick, '/compareproducts/add/40')]" );
    private  By _product2 = By.linkText("Flower Girl Bracelet");
    private  By _addcompare2 = By.xpath( "//input[contains(@onclick,'/compareproducts/add/41')]" );
    private  By _compareLink = By.linkText("product comparison");


    // asser user on jewelry page
    public void userOnjewelryPage(){
        assertCurrentURLR( "https://demo.nopcommerce.com/jewelry" );
    }
// user click on prodect1

    public void choseProductsToCompare(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        clickElement( _product1 );
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickElement( _addcompare1 );
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        clickElement( _product2 );
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickElement( _addcompare2 );


        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickElement( _compareLink );
    }

}
