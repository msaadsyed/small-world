package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.GlobalVars;

public class Products_PO extends Base_PO{
    public Products_PO()
    {
        super();
    }

    private @FindBy(className = "inventory_details_name") WebElement product_page_title;

    private @FindBy(css = "button[id^='add-to-cart']") WebElement add_to_cart_button;

    private @FindBy(className = "shopping_cart_link") WebElement cart_icon_link;

    private @FindBy(className = "shopping_cart_badge") WebElement cart_icon_badge;

    private @FindBy(css = "div.header_secondary_container > span[class='title']") WebElement page_header_title;

    public void productPageOpenSuccessfully(String productPage){
        waitForElement_And_ValidateText(product_page_title,productPage);
    }

    public boolean addToCartButtonIsVisible(){
        WebDriverWait wait = new WebDriverWait(getDriver(), GlobalVars.WEBDRIVER_DEFAULT_EXPLICIT_TIMEOUT);
        boolean addToCartButton = wait.until(ExpectedConditions.visibilityOf(add_to_cart_button)).isDisplayed();

        return addToCartButton;
    }

    public void clickAddToCartButton(){
        waitForWebElementAndClick(add_to_cart_button);
    }

    public int verifyNumberOfProductOnCartIcon()
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), GlobalVars.WEBDRIVER_DEFAULT_EXPLICIT_TIMEOUT);
        int numberOfProduct = Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(cart_icon_badge)).getText());

        return numberOfProduct;
    }

    public void ClickCartIcon(){
        waitForWebElementAndClick(cart_icon_link);
    }

    public void VerifyPageTitle(String pageTitle){
        waitForElement_And_ValidateText(page_header_title,pageTitle);
    }

    public void verifyProductOnMyCart(String productName)
    {
        waitForElement_And_ValidateText(inventory_title,productName);
    }

}
