package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SearchPage {

    WebDriver driver;
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[3]/div/span/div/div/span/a/div/img[1]")
    public WebElement firstItem;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy(id = "huc-v2-order-row-icon")
    public WebElement addedCartCheck;

    public void clickFirstItem(){
        firstItem.click();
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }


}

///