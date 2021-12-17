<<<<<<< HEAD
package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage {

    WebDriver driver;
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement accountAndListButton;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInputTextbox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchSubmitButton;


    @FindBy(id="nav-hamburger-menu")
    public WebElement navHamButton;

    @FindBy(xpath = "//div[2]/div/ul[1]/li[14]/a")
    public WebElement accountButton;

    @FindBy(className = "SignInAndSecurity")
    public WebElement signInAndSecurityOptionsButton;

    @FindBy(id = "auth-cnep-edit-name-button")
    public WebElement nameChangeButton;

    @FindBy(id = "ap_customer_name")
    public WebElement nameInput;

    @FindBy(id = "cnep_1C_submit_button")
    public WebElement submitNameChangeBtn;

    @FindBy(id = "a-alert-heading")
    public WebElement alertChange;

    @FindBy(className = "hud-profile-greeting")
    public WebElement helloMessage;



    public void clickAccountAndListButton(){
        accountAndListButton.click();
    }

    public void enterSearchInput(String searchItem){
        searchInputTextbox.click();
        searchInputTextbox.sendKeys(searchItem);
    }

    public void clickSearch(){
        searchSubmitButton.click();
    }

    public void clickNavHamButton(){
        navHamButton.click();
    }

    public void clickAccountButton(){
        accountButton.click();
    }
    public void clickSignInAndSecurityOptionsButton(){
        signInAndSecurityOptionsButton.click();
    }

    public void clickNameChange(){
        nameChangeButton.click();
    }
    public void enterNameToUpdate(String name){
        nameInput.click();
        nameInput.sendKeys(name);
    }

    public void clickSubmitToChangeName(){
        submitNameChangeBtn.click();
    }




}
=======
package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage {

    WebDriver driver;
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement accountAndListButton;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInputTextbox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchSubmitButton;


    @FindBy(id="nav-hamburger-menu")
    public WebElement navHamButton;

    @FindBy(xpath = "//div[2]/div/ul[1]/li[14]/a")
    public WebElement accountButton;

    @FindBy(className = "SignInAndSecurity")
    public WebElement signInAndSecurityOptionsButton;

    @FindBy(id = "auth-cnep-edit-name-button")
    public WebElement nameChangeButton;

    @FindBy(id = "ap_customer_name")
    public WebElement nameInput;

    @FindBy(id = "cnep_1C_submit_button")
    public WebElement submitNameChangeBtn;

    @FindBy(id = "a-alert-heading")
    public WebElement alertChange;

    @FindBy(className = "hud-profile-greeting")
    public WebElement helloMessage;



    public void clickAccountAndListButton(){
        accountAndListButton.click();
    }

    public void enterSearchInput(String searchItem){
        searchInputTextbox.click();
        searchInputTextbox.sendKeys(searchItem);
    }

    public void clickSearch(){
        searchSubmitButton.click();
    }

    public void clickNavHamButton(){
        navHamButton.click();
    }

    public void clickAccountButton(){
        accountButton.click();
    }
    public void clickSignInAndSecurityOptionsButton(){
        signInAndSecurityOptionsButton.click();
    }

    public void clickNameChange(){
        nameChangeButton.click();
    }
    public void enterNameToUpdate(String name){
        nameInput.click();
        nameInput.sendKeys(name);
    }

    public void clickSubmitToChangeName(){
        submitNameChangeBtn.click();
    }




}
>>>>>>> 60493316f94d8167968eba7c4d2544aa4d8f504a
