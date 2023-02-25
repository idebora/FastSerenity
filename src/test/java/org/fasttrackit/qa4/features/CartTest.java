package org.fasttrackit.qa4.features;

import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {
        int index = 0;
        productSteps.navigateToShopPage();
        String expected = productSteps.addSimpleProduct(index);
        cartSteps.navigateToCartPage();
        cartSteps.verifyAddedProduct(index, expected);
    }

    @Test
    public void modifyQuantityForAProductFromCartTest() {
        int index = 0;
        productSteps.navigateToShopPage();
        productSteps.addSimpleProduct(index);
        cartSteps.navigateToCartPage();
        cartSteps.verifyPriceAfterChange(index);
    }
}
