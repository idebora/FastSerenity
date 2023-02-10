package org.fasttrackit.qa4.features;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void AddProductToCart(){
        productSteps.navigateToShopPage();
        String productName = productSteps.getFirstSimpleProductName();
        productSteps.addSimpleProduct();
        cartSteps.navigateToCartPage();
        cartSteps.verifyAddedProduct(productName);
    }

    @Test
    public void modifyQuantityForAProductFromCart(){
        int index = 0;
        productSteps.navigateToShopPage();
        productSteps.addSimpleProduct();
        cartSteps.navigateToCartPage();
        float firstQtyValue = cartSteps.getPrice(index);
        int qty = cartSteps.modifyQuantityForOneProduct(index);
        float lastQtyValue = cartSteps.getPrice(index);
        cartSteps.verifyQty(firstQtyValue,lastQtyValue,qty);
    }
}
