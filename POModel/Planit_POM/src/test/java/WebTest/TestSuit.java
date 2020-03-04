package WebTest;

//import org.junit.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
   BaseTest baseTest = new BaseTest();
    AddToCart addToCartPage = new AddToCart();

    //SoftAssert softAssert = new SoftAssert();

    @Test
    public void verifyAddItemToCart() {

        addToCartPage.verifyAddItemToCart();
    }


}
