package org.fasttrackit.qa4.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{


    @Step
    public void navigateToCartPage(){
        homePage.clickOnCartLink();
    }


    @Step
    public void verifyAddedProduct(String expected){
        Assert.assertEquals(cartPage.getSingleAddedProductName(), expected);
    }


    @Step
    public int modifyQuantityForOneProduct(int index){
        String qty = cartPage.getQuantity(index);
        int qtyInt = Integer.parseInt(qty);
        int newQty = qtyInt + 1;
        cartPage.setNewQuantity(index,newQty);
        return newQty;
    }

    @Step
    public float getPrice(int index){
      return cartPage.getValuePrice(index);
    }

    @Step
    public void verifyQty(float first, float last, int qty){
        Assert.assertEquals(first *qty, last, 0);
    }
}
