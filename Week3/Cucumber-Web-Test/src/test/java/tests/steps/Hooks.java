package tests.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.time.Duration;

public class Hooks {


    @Before
    public void setUp() throws Exception{
        Driver.getDriver().get("https://www.amazon.com.tr/");
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();

    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}
