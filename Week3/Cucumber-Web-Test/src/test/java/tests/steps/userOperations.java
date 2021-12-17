package tests.steps;

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
import tests.pages.HomePage;
import tests.pages.LoginPage;

public class userOperations {


    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("Kullanıcı anasayfayı ziyaret eder.")
    public void kullanıcıAnasayfayıZiyaretEder() {

    }
    @When("Kullanıcı Hesap ve Listeler' e tıklar.")
    public void kullanıcıHesapVeListelerETıklar() {

        homePage.clickAccountAndListButton();

    }
    @When("{string} girilir ve devam et butonuna tıklanır.")
    public void girilirVeDevamEtButonunaTıklanır(String arg0) {

        loginPage.enterMail(arg0);
        loginPage.clickContinue();

    }
    @When("{string} girilir. Giriş yap butonuna tıklanır.")
    public void girilirGirişYapButonunaTıklanır(String arg0) {

        loginPage.enterPassword(arg0);
        loginPage.clickSubmit();
    }
    @Then("Giriş yapıldığı görülür.")
    public void girişYapıldığıGörülür() {
        Assert.assertEquals("Merhaba BKTest", homePage.helloMessage.getText());

    }
}
