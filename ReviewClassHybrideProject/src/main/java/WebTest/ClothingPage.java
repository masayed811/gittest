package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ClothingPage extends Utils {
    private By _sortBy = By.xpath( "//div/select[contains(@aria-label,\"Select product sort order\")]" );
    private By _highToLaw = By.xpath( "//*[@id=\"products-orderby\"]" );


    public void userOnClothingPage() {
        assertWithURL( "clothing" );

    }
// // click on sort by drop down
//
//    public void clickSortByDropDownManue(){
//        try {
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//      clickElement( _sortBy );
//        try {
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//    // selectValueFromDropdown(_highToLaw,data);
//
//      // selectTextValue(_highToLaw,"Created on");
//
//    }

    public void userveryfyTheProductList() {
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> productList = driver.findElements( By.xpath( "//div/span[@class=\"price actual-price\"]" ) );
        for (WebElement web : productList) {
            System.out.println( web.getText() );
            System.out.println("**********************");
            //  assertWithContainsText(web.getText(), "$" );
            softAssert.assertTrue( web.getText().contains( "$" ),"$ not Found"+ web.getText() );

        }
        softAssert.assertAll();
    }
}
