package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddToCart_FeaturedProducts extends Utils {
    public void veryfyingFeaturedProducts() {


        List<WebElement> productList = driver.findElements( By.xpath( "//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div" ) );
        for (WebElement element : productList) {
            // System.out.println( element.getText() );
            //boolean present = true;

            element.getText();

            for (int i = 0; i < element.getText().length(); i++) {

                if (driver.findElement( By.xpath( "//input[@class=\"button-2 product-box-add-to-cart-button\"]" ) ).isDisplayed()) {

                    driver.findElement( By.xpath( "//input[@class=\"button-2 product-box-add-to-cart-button\"]" ) ).click();
                    System.out.println("There is  Add to Button");
                }

                else
                    System.out.println( " There is Noooooooot  Add to Button " );
            }

        }
    }}


