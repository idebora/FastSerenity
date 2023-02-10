package org.fasttrackit.qa4.pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "[name=login]")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorLoginMessage;


    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public String getErrorMessage() {
        return errorLoginMessage.getText();
    }

}