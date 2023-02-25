package org.fasttrackit.qa4.steps;

import net.thucydides.core.annotations.Step;

public class ProductSteps extends BaseSteps {

    @Step
    public void navigateToShopPage() {
        homePage.clickOnShopLink();
    }

    @Step
    public String addSimpleProduct(int index) {
        shopPage.addSimpleProduct(index);
        return shopPage.getFirstSimpleProductName(index);
    }
}
