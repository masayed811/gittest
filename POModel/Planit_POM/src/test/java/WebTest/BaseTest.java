package WebTest;

//import org.junit.After;
//import org.junit.Before;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
   // LoadProp loadProp=new LoadProp();
BrowserSelector browserSelector=new BrowserSelector();
    @BeforeMethod
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
       driver.get("http://automationpractice.com/index.php");
//        System.out.println(driver.getCurrentUrl());
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }
}
