package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ContractUs extends Utils {


        private By _ClickOnContactUs= By.xpath("//div[@id='contact-link']//a[contains(text(),'Contact us')] ");
        private By _SelcetSubject=By.xpath("//select[@id='id_contact']");
        private By _ClickOnCustomerService=By.xpath("//option[contains(text(),'Customer service')]");
        private By _enterEmail=By.xpath("//input[@id='email']");
       // private By _enterOrderReference=By.xpath("//input[@id='id_order']");
        private By _enterMessage=By.xpath("//textarea[@id='message']");
        private By _clickOnSendButton=By.xpath("//span[contains(text(),'Send')]");

        private By _verifyUserSendMessageSuccessfully=By.xpath("//p[@class='alert alert-success']");
        public void userClickOnContact()
        {
            clickElements(_ClickOnContactUs);

        }
        public void userEnterAllDetail()
        {
            clickElements(_SelcetSubject);
            clickElements(_ClickOnCustomerService);
           // enterText(_enterEmail);
           // enterText(  _enterOrderReferenc );
            //enterText(_enterMessage);
            clickElements(_clickOnSendButton);
            Assert.assertEquals("Your message has been successfully sent to our team.",_verifyUserSendMessageSuccessfully);
        }
    }


