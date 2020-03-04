package Com.NobPage;

import org.openqa.selenium.By;

public class CatagoriesPage extends Utils {
    private By _noteBooks =By.xpath("//h2/a[contains(@title,\"Show products in category Notebooks\")]"); //linkText("Notebooks");
    private By _appleMac = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.xpath("//input[@type=\"button\"and@value=\"Email a friend\"]");
    private By _friendEmail = By.xpath("//input[@class=\"friend-email\"]");
    private By _writeIntextBox = By.xpath("//*[@id=\"PersonalMessage\"]");
    private By _sendEmail = By.xpath("//input[@name=\"send-email\"]");
    private By _succesfullReferMessage = By.xpath("//*[@class=\"result\"]");
    String message = " I like this product ,so you can try it";


    // Verify user on computer catagories page
    public void veryUseronComputercatagoriesPage(){
        assertWithURL( "computers" );
    }
public void userClickOnNoteBook(){
        clickElement( _noteBooks );
//select item Apple MacBook Pro
      clickElement( _appleMac );
      }
// Refer to friend
public void userReferToFriend(){
        //click email to refer
    clickElement( _email );
//Enter details to refer a friend
    enterText( _friendEmail,"sayed811@yahoo.co.uk" );
    //enter text in text box
    enterText(_writeIntextBox,"message"  );
// click send email button
    clickElement( _sendEmail );
    // assert Message
    assertText( "Your message has been sent.",_succesfullReferMessage);
    System.out.println( "Your message has been sent successfully" );
}
}
