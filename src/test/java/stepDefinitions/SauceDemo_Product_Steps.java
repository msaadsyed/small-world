package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.MainCalls;
import org.testng.Assert;
import org.testng.reporters.jq.Main;

public class SauceDemo_Product_Steps {

    @When("sam filter the product from {string}")
    public void filterProduct(String filter) {
        MainCalls.getSd_DashboardPO().sortProduct(filter);
    }

    @Then("filter should be applied with {string} on top")
    public void filterOnProductShouldBeApplied(String topProduct) {
        Assert.assertEquals(MainCalls.getSd_DashboardPO().verifySortingIsAppliedSuccessfully(),topProduct,"Sorting not applied");
    }

    @When("sam select product {string}")
    public void selectProductFromInventory(String productName) {
        MainCalls.getSd_DashboardPO().selectProductFromInventory(productName);
    }

    @Then("product {string} should be open")
    public void selectedProductShouldBeOpen(String productName) {
        MainCalls.getSd_product_PO().productPageOpenSuccessfully(productName);
    }

    @Then("Add to cart button should be visible")
    public void addToCartButtonShouldBeVisible() {
        MainCalls.getSd_product_PO().addToCartButtonIsVisible();
    }
    @When("Sam clicks on Add to cart button")
    public void clickAddToCartButton() {
        MainCalls.getSd_product_PO().clickAddToCartButton();
    }

    @Then("Cart Icon should show {int} product in cart")
    public void verifyNumberOfProductInCartIcon(int noOfProduct) {
        Assert.assertEquals(MainCalls.getSd_product_PO().verifyNumberOfProductOnCartIcon(),noOfProduct, "Product count is different");
    }
    @Then("Click on cart icon")
    public void clickCartIcon() {
        MainCalls.getSd_product_PO().ClickCartIcon();
    }
    @Then("{string} page should be open")
    public void pageShouldBeOpen(String pageName) {
        MainCalls.getSd_product_PO().VerifyPageTitle(pageName);
    }

    @Then("Product {string} should present with description")
    public void productShouldBePresentWithDescription(String productName) {
        MainCalls.getSd_product_PO().verifyProductOnMyCart(productName);
    }
}
