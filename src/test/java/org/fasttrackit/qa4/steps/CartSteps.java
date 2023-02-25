package org.fasttrackit.qa4.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.text.ParseException;

public class CartSteps extends BaseSteps {
    @Step
    public void navigateToCartPage() {
        homePage.clickOnCartLink();
    }

    @Step
    public void verifyAddedProduct(int index, String expected) {
        Assert.assertEquals(expected, cartPage.getProductName(index));
    }

    @Step
    public int modifyQuantityForOneProduct(int index) {
        String qty = cartPage.getQuantity(index);
        int qtyInt = Integer.parseInt(qty);
        int newQty = qtyInt + 1;
        cartPage.setNewQuantity(index, newQty);
        waitABit(200);
        return newQty;
    }

    @Step
    public float getPrice(int index) throws ParseException {
        return cartPage.getValuePrice(index);
    }

    @Step
    public void verifyPriceAfterChange(int index) {
        try {
            float initialPrice = getPrice(index);
            int quantity = modifyQuantityForOneProduct(index);
            float finalPrice = getPrice(index);
            Assert.assertEquals(initialPrice * quantity, finalPrice, 0);
        } catch (ParseException e) {
            Assert.fail();
        }
    }
}
