package Com.NobPage;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {
    public void OpenBrowser() {

            System.setProperty( "webdriver.chrome.driver", "C:\\SRC\\gittest\\Com_NobPageObj\\src\\test\\Recesources\\BrowserDriver\\chromedriver.exe" );
            driver = new ChromeDriver();
            // driver.get( "https://demo.nopcommerce.com/" ); //asking driver for url
            driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
            driver.manage().window().fullscreen();
            driver.get( "https://demo.nopcommerce.com/" );
    }
    public void closeBrowser(){
        driver.close();
    }
}