package org.fasttrackit.qa4.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(css = ".woocommerce-MyAccount-content p")
    private WebElementFacade welcomeTextElement;

    public void userIsLoggedIn(String userName) {
        welcomeTextElement.shouldContainText("Hello " + userName);
    }
}
