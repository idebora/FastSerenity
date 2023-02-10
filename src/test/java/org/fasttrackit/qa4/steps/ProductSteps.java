package org.fasttrackit.qa4.steps;

import net.thucydides.core.annotations.Step;

public class ProductSteps extends BaseSteps{


    @Step
    public void navigateToShopPage() {
        homePage.clickOnShopLink();
    }

    @Step
    public String getFirstSimpleProductName(){
        return productsPage.getFirstSimpleProductName();
    }

    @Step
    public void addSimpleProduct(){
        productsPage.addSimpleProduct();
    }
}
