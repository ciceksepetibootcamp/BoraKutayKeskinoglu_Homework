package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userOperations {


    WebDriver driver;
    @Before
    public void setUp() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("Kullanıcı anasayfayı ziyaret eder.")
    public void kullanıcıAnasayfayıZiyaretEder() {
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
    }

    @When("Kullanıcı Hesap ve Listeler' e tıklar.")
    public void kullanıcıHesapVeListelerETıklar() {

        driver.findElement(By.id("nav-link-accountList")).click();


    }

    @When("{string} girilir ve devam et butonuna tıklanır.")
    public void girilirVeDevamEtButonunaTıklanır(String arg0) {

        driver.findElement(By.id("ap_email")).click();
        driver.findElement(By.id("ap_email")).sendKeys(arg0);
        driver.findElement(By.id("continue")).click();

    }

    @When("{string} girilir. Giriş yap butonuna tıklanır.")
    public void girilirGirişYapButonunaTıklanır(String arg0) {

        driver.findElement(By.id("ap_password")).click();
        driver.findElement(By.id("ap_password")).sendKeys(arg0);
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("Giriş yapıldığı görülür.")
    public void girişYapıldığıGörülür() {
        //giriş yapın değilse --->     av-link-accountList-nav-line-1

        Assert.assertFalse(String.valueOf(false),driver.findElement(By.xpath("//span[contains(text(), 'Giriş yapın')]")).isDisplayed());

    }
}
//span[contains(@text,'Giriş yapın')]