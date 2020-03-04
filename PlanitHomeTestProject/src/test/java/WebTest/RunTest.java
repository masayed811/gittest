package WebTest;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = " @ContactUs, @AddToCart,@CraetAccount,@RemoveFromCart, ", format = {"pretty", "html:target/cucumber-report"})

public class RunTest {
}
