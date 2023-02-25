package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class LoginAdminPage extends BasePage {

    @FindBy(id = "user_login")
    private WebElementFacade adminNameField;

    @FindBy(id = "user_pass")
    private WebElementFacade adminPasswordField;

    @FindBy(id = "wp-submit")
    private WebElementFacade adminLoginButton;


    public void setEmailField(String value) {
        typeInto(adminNameField, value);
    }

    public void setPasswordField(String value) {
        typeInto(adminPasswordField, value);
    }

    public void clickLoginButton() {
        clickOn(adminLoginButton);
    }

}