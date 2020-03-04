package Com.NobPage;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationSuccessfulPage registrationSuccessfulPage =new RegistrationSuccessfulPage();
    CatagoriesPage catagoriesPage = new CatagoriesPage();
    ReferUnsuccessfullPage referUnsuccessfullPage = new ReferUnsuccessfullPage();
    JewelryPage jewelryPage = new JewelryPage();
    ComparePage comparePage =new ComparePage();
    ClothingPage clothingPage =new ClothingPage();

    @Test


public void userRegisterSuccessfully() {
//user click on register button for registation
        homePage.userClickOnRegister();
//Assert user on registration page
        registrationPage.veryfyUserOnRegistrationPage();
        //Enter the details
        registrationPage.userEnterDetails();

//rigistation successfull
        registrationSuccessfulPage.registrationSuccessful();

//    }
//    @Test
        // click computer catagories from homepage
        //   public void userNavigateOnComputerCatagories () {
        homePage.clickOnComputerCetagory();
//}
//@Test
        //veryfiy user on computer page
        // public void veryfyUserOnComputerCatagoriesPage(){
        catagoriesPage.veryUseronComputercatagoriesPage();
//            }
//           @Test
// public void userOnNoteBooksPageAndSelectItem(){
        catagoriesPage.userClickOnNoteBook();
 }
 //@Test
 public void userIsonReferalPageToSendEmail(){
        catagoriesPage.userReferToFriend();
    }
    // Refer send unsuccessfull witouth Register
@Test
        public  void messeageUnsuccessfullWithoutRegister(){
    homePage.clickOnComputerCetagory();
    referUnsuccessfullPage.veryUseronComputercatagoriesPage();
    referUnsuccessfullPage.userClickOnNoteBook();
        referUnsuccessfullPage.userReferToFriendWithoutRegister();
}
 @Test
// compare products
    public  void userCompareDifferentProductsSuccessfully(){
        homePage.cliclOnJewelryButton();
        jewelryPage.userOnjewelryPage();
        jewelryPage.choseProductsToCompare();
        comparePage.userOnComparePage();

    }
    @Test
    public void userCanPrintTheProductList(){
        homePage.moveToApparelPageForClothing();
       clothingPage.userOnClothingPage();
        clothingPage.userveryfyTheProductList();
    }

//    @Test
//    public void userSortTheClothingPriceHighToLaw(){
//        homePage.moveToApparelPageForClothing();
//        clothingPage.userOnClothingPage();
//        clothingPage.clickSortByDropDownManue();
//
//    }

    }

