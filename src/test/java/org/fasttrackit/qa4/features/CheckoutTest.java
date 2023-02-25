package org.fasttrackit.qa4.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutWithValidDataTest() {
        productSteps.navigateToShopPage();
        productSteps.addSimpleProduct(0);

        checkoutsteps.navigateToCheckoutPage();
        checkoutsteps.typeFirstName("Elisa");
        checkoutsteps.typeLastName("Duma");
        checkoutsteps.typeCompanyName("Dumy");
        checkoutsteps.selectCountryName("Romania");
        checkoutsteps.typeAddressBilling("str. Brad,nr. 4");
        checkoutsteps.typeCityBilling("Aiud");
        checkoutsteps.selectStateBilling("Alba");
        checkoutsteps.typePostcodeBilling("221211");
        checkoutsteps.typePhoneBilling("4470819");
        checkoutsteps.typeEmailBilling("elisaduma21@gmail.com");
        checkoutsteps.placeOrder();
        checkoutsteps.verifyPlacedOrder();
    }
}
