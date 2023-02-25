package org.fasttrackit.qa4.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import utils.Messages;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void navigateToCheckoutPage() {
        homePage.clickOnCheckoutLink();
    }

    @Step
    public void typeFirstName(String firstName) {
        checkoutPage.setFirstNameBillingField(firstName);
    }

    @Step
    public void typeLastName(String lastName) {
        checkoutPage.setLastNameBillingField(lastName);
    }

    @Step
    public void typeCompanyName(String company) {
        checkoutPage.setCompanyBillingField(company);
    }

    @Step
    public void selectCountryName(String value) {
        checkoutPage.selectCountryDropDownValues(value);
    }

    @Step
    public void typeAddressBilling(String address) {
        checkoutPage.setAddress1BillingField(address);
    }

    @Step
    public void typeCityBilling(String city) {
        checkoutPage.setCityBillingField(city);
    }

    @Step
    public void selectStateBilling(String value) {
        checkoutPage.selectState(value);
    }

    @Step
    public void typePostcodeBilling(String postcode) {
        checkoutPage.setPostcodeBillingField(postcode);
    }

    @Step
    public void typePhoneBilling(String phone) {
        checkoutPage.setPhoneBillingField(phone);
    }

    @Step
    public void typeEmailBilling(String email) {
        checkoutPage.setEmailBillingField(email);
    }

    @Step
    public void placeOrder() {
        checkoutPage.clickOnOrderButton();
    }

    @Step
    public void verifyPlacedOrder() {
        Assert.assertEquals(Messages.successfulCheckout, checkoutPage.getSuccessMessage());
    }

}
