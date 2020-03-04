package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;

public class  AddToCart extends Utils {

    private By _ClickOnItem= By.xpath("//*[@id=\"fNZvTpKUuVCayKdWOzM-mg\"]/div[2]/a/div/img");

    private By _ClickOnSelectItem= By.xpath("//*[@id=\"result_1\"]/div/div/div/div[2]/div[1]/div[1]/a/h2");


    private By _ClickQuantity=By.xpath("//*[@id=\"quantity\"]");

    private By _ClickAddToCart=By.xpath("//*[@id=\"add-to-cart-button\"]");

    private By _verifyItemAdded=By.xpath("//*[@id=\"huc-v2-order-row-confirm-text\"]/h1");





    public void ClickOnItem (){

        clickElements(_ClickOnItem);
        clickElements(_ClickOnSelectItem);
        clickElements(_ClickQuantity);
        //selectTextByValue(_EntertQuantity);
        //selectValueFromDropDown(_EntertQuantity);
        clickElements(_ClickAddToCart);
        Assert.assertEquals("Added to Cart.\n",_verifyItemAdded);
    }
}
