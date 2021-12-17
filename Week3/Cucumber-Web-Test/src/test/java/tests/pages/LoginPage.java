<<<<<<< HEAD
package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {

    WebDriver driver;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ap_email")
    public WebElement mailInput;

    @FindBy(id = "continue")
    public WebElement continueBtn;

    @FindBy(id = "ap_password")
    public WebElement passwordInput;

    @FindBy(id = "signInSubmit")
    public WebElement submitBtn;

    public void enterMail(String mail) {
        mailInput.click();
        mailInput.sendKeys(mail);
    }

    public void clickContinue() {
        continueBtn.click();
    }

    public void enterPassword(String password) {
        passwordInput.click();
        passwordInput.sendKeys(password);

    }
    public void clickSubmit() {
        submitBtn.click();
    }

}
=======
package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {

    WebDriver driver;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ap_email")
    public WebElement mailInput;

    @FindBy(id = "continue")
    public WebElement continueBtn;

    @FindBy(id = "ap_password")
    public WebElement passwordInput;

    @FindBy(id = "signInSubmit")
    public WebElement submitBtn;

    public void enterMail(String mail) {
        mailInput.click();
        mailInput.sendKeys(mail);
    }

    public void clickContinue() {
        continueBtn.click();
    }

    public void enterPassword(String password) {
        passwordInput.click();
        passwordInput.sendKeys(password);

    }
    public void clickSubmit() {
        submitBtn.click();
    }

}
>>>>>>> 60493316f94d8167968eba7c4d2544aa4d8f504a
