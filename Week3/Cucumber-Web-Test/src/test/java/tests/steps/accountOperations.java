package tests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import tests.pages.HomePage;

public class accountOperations {
    WebDriver driver;
    HomePage homePage = new HomePage();
    @When("Tümü butonuna tıklanır.")
    public void tümüButonunaTıklanır() {
        homePage.clickNavHamButton();
    }

    @When("Hesabım butonuna tıklanır.")
    public void hesabımButonunaTıklanır() {
        homePage.clickAccountButton();
    }

    @When("Giriş yapma ve Güvenlik butonuna tıklanır.")
    public void girişYapmaVeGüvenlikButonunaTıklanır() {
        homePage.clickSignInAndSecurityOptionsButton();
    }

    @When("Ad kısmında düzenle butonuna tıklanır.")
    public void adKısmındaDüzenleButonunaTıklanır() {
        homePage.clickNameChange();
    }

    @When("Güncellenilmesi istenilen {string} girilir. Değişiklikleri kaydet butonuna tıklanır.")
    public void güncellenilmesiIstenilenGirilirDeğişiklikleriKaydetButonunaTıklanır(String arg0) {
        homePage.enterNameToUpdate(arg0);
        homePage.clickSubmitToChangeName();
    }

    @Then("İşlemin başarılı olduğu görülür.")
    public void işleminBaşarılıOlduğuGörülür() {

        Assert.assertTrue(String.valueOf(true),homePage.alertChange.isDisplayed());

    }
}
