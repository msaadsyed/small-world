package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.GlobalVars;

import java.util.List;

public class Dashboard_PO extends Base_PO{
    public Dashboard_PO(){
        super();
    }


    private @FindBy(className = "app_logo") WebElement dashboard_PageTitle;

    private @FindBy(id = "inventory_container") WebElement inventory_container;

    public void verifyDashboardPageTitle(String headText){
        waitForElement_And_ValidateText(dashboard_PageTitle,headText);
    }

    public boolean IsInventoryItemsVisible()
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), GlobalVars.WEBDRIVER_DEFAULT_EXPLICIT_TIMEOUT);
        boolean inventoryListShowing = wait.until(ExpectedConditions.visibilityOf(inventory_container)).isDisplayed();

        return inventoryListShowing;
    }
}
