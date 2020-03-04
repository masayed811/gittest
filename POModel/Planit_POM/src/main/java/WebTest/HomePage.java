package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils {




        LoadProp loadProp = new LoadProp();



        public void userIsOnHomePage() {

            assertCurrentURL( "http://automationpractice.com/index.php" );
            System.out.println( "user is on homepage" );
        }


    }

