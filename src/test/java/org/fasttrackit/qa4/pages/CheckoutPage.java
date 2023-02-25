package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.FluentDropdownSelect;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameBillingField;

    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNameBillingField;

    @FindBy(id = "billing_company")
    private WebElementFacade companyBillingField;

    @FindBy(id = "select2-billing_country-container")
    private WebElementFacade countryDropDown;

    @FindBy(className = "select2-search__field")
    private WebElementFacade searchInput;

    @FindBy(id = "billing_address_1")
    private WebElementFacade address1BillingField;

    @FindBy(id = "billing_city")
    private WebElementFacade cityBillingField;

    @FindBy(css = "#billing_state_field .select2-selection--single")
    private WebElementFacade stateDropDown;

    @FindBy(id = "billing_postcode")
    private WebElementFacade postcodeBillingField;

    @FindBy(id = "billing_phone")
    private WebElementFacade phoneBillingField;

    @FindBy(id = "billing_email")
    private WebElementFacade emailBillingField;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = "#main .woocommerce-thankyou-order-received")
    private WebElementFacade orderMessage;

    public void setFirstNameBillingField(String value) {
        typeInto(firstNameBillingField, value);
    }

    public void setLastNameBillingField(String value) {
        typeInto(lastNameBillingField, value);
    }

    public void setCompanyBillingField(String value) {
        typeInto(companyBillingField, value);
    }

    public void selectCountryDropDownValues(String value) {
        countryDropDown.click();
        searchInput.sendKeys(value, Keys.ENTER);
    }

    public void setAddress1BillingField(String value) {
        typeInto(address1BillingField, value);
    }

    public void setCityBillingField(String value) {
        typeInto(cityBillingField, value);
    }

    public void selectState(String value) {
        stateDropDown.click();
        searchInput.sendKeys(value, Keys.ENTER);
        FluentDropdownSelect select = stateDropDown.select();
    }

    public void setPostcodeBillingField(String value) {
        typeInto(postcodeBillingField, value);
    }

    public void setPhoneBillingField(String value) {
        typeInto(phoneBillingField, value);
    }

    public void setEmailBillingField(String value) {
        typeInto(emailBillingField, value);
    }

    public void clickOnOrderButton() {
        clickOn(placeOrderButton);
    }

    public String getSuccessMessage() {
        orderMessage.waitUntilPresent();
        return orderMessage.getText();
    }

}
