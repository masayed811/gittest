package WebTest;

import org.openqa.selenium.By;

public class RemoveFromCart extends Utils{
    private By _ClickOnCart= By.xpath( " " );
    private By _ClickOnDelet= By.xpath(" ");


    public void RemoveItemFromCart(){
        hoverElement(_ClickOnCart);
        clickElements(_ClickOnDelet);

    }
}
