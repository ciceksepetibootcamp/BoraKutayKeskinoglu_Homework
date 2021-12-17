package tests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import tests.pages.HomePage;
import tests.pages.SearchPage;

public class search {

    WebDriver driver;
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

    @When("Kullanıcı arama butonuna {string} girer ve arama butonuna tıklar.")
    public void kullanıcıAramaButonunaGirerVeAramaButonunaTıklar(String arg0) {
        homePage.enterSearchInput(arg0);
        homePage.clickSearch();
    }

    @When("Kullanıcı ürüne tıklar.")
    public void kullanıcıÜrüneTıklar() {
        searchPage.clickFirstItem();
    }

    @When("Kullanıcı sepete ekle butonuna tıklar.")
    public void kullanıcıSepeteEkleButonunaTıklar() {
        searchPage.clickAddToCartButton();
    }

    @Then("İlgili ürünün sepete eklendiği görülür.")
    public void ilgiliÜrününSepeteEklendiğiGörülür() {
        Assert.assertTrue(String.valueOf(true),searchPage.addedCartCheck.isDisplayed());
    }
}
