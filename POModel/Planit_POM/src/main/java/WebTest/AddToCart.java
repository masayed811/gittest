package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;

public class  AddToCart extends Utils {

    private By _ClickOnItem= By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[2] ");

    private By _clearAndEnterQuantity=By.xpath("//*[@id=\"quantity_wanted\"]");
    private By _SelectSize=By.xpath("//*[@id=\"group_1\"]");
    private By _ClickColor=By.xpath("//*[@id=\"color_8\"]");
    private By _ClickAddToCart=By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    private By _verifyProductAddSuccessfully=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");

   // {System.out.println ( "Currently in Add to Cart " ); }

    public void verifyAddItemToCart (){

        clickElements(_ClickOnItem);
        clearAndEnterText(_clearAndEnterQuantity);
        clickElements(_SelectSize);
        clickElements(_ClickColor);
        clickElements(_ClickAddToCart);
               Assert.assertEquals("Product successfully added to your shopping cart.\n",_verifyProductAddSuccessfully);
        System.out.println ( "YES YES Currently in Add to Cart " );
    }
    }

