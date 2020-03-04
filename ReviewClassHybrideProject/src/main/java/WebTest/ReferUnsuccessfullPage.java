package WebTest;

import org.openqa.selenium.By;

public class ReferUnsuccessfullPage extends Utils {
    private By _noteBooks =By.linkText("Notebooks");
    private By _appleMac = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.xpath( "//input[@class=\"button-2 email-a-friend-button\"] " );
    private By _friendEmail = By.xpath( "//input[contains(@id,\"FriendEmail\")]" );
    private  By _userEmail = By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _writeIntextBox = By.xpath( "//*[@id=\"PersonalMessage\"]" );
    private By _sendEmail = By.xpath( "//input[@name=\"send-email\"]" );
    private By _UnsuccesfullReferMessage = By.xpath("//ul/li[text()=\"Only registered customers can use email a friend feature\"]");
    public static String timestamp = currentTimeStamp();


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
    public void userReferToFriendWithoutRegister(){
        //click email to refer
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickElement( _email );
//Enter email details to refer a friend
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        enterText( _friendEmail,"sayed811"+timestamp+"@yahoo.co.uk" );
        //Enter user email
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        enterText( _userEmail,"eeyuuu"+timestamp+"@yahoo.com" );

        //enter text in text box
        enterText(_writeIntextBox,"message"  );
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
// click send email button
        clickElement( _sendEmail );
        // assert Message
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        assertByGetText( "Only registered customers can use email a friend feature",_UnsuccesfullReferMessage,"Only registered customers can use email a friend feature" );
        //assertText( "Only registered customers can use email a friend feature.",_UnsuccesfullReferMessage);
        System.out.println( "Your message  sent Unsuccessfull" );
    }
}


