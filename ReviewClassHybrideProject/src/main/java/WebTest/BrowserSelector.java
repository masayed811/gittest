package WebTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {

    LoadProp loadProp = new LoadProp();

    public void setUpBrowser() {


//Befor LoadProp Code was bellow:-
//        System.setProperty( "driver.chrome.driver","C:\\SRC\\gittest\\ReviewClassNopCommercs\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe" );
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
//        driver.manage().window().fullscreen();
//        driver.get( "https://demo.nopcommerce.com/" );

        //after LoadProp

        String browserName = loadProp.getProperty( "browser" );

   // String browserName = System.getProperty( "browser" );

        if (browserName.equalsIgnoreCase( "firefox" )) {

            System.setProperty( "webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe" );
            System.setProperty( FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true" );
            System.setProperty( FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null" );

            driver = new FirefoxDriver();
            driver.manage().window().fullscreen();

        } else if (browserName.equalsIgnoreCase( "chrome" )) {
            System.setProperty( "webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe" );
            ChromeOptions options = new ChromeOptions();
            options.addArguments( "--disable-infobars" );
            options.addArguments( "--disable-extension" );
            options.addArguments( "--disable-setUpBrowser-side-navigation" );
            options.addArguments( "--incognito" );
            options.addArguments( "--disable-blink-features-BlockCredentialeSubresources" );
            driver = new ChromeDriver( options );
            driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
            driver.manage().window().fullscreen();

        } else if (browserName.equalsIgnoreCase( "ie" )) {
            System.setProperty( "webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe" );
            System.out.println( "here" );
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.setCapability( InternetExplorerDriver.IE_SWITCHES, "-privet" );
            options.setCapability( InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true );
            driver = new InternetExplorerDriver( options );
            driver.manage().window().maximize();

        } else {
            System.out.println( "Browser name is empty or trped wrong" + browserName );
        }
    }


    public void closeBrowser() {

        driver.close();
    }

}