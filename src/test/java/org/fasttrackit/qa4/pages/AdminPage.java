package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage {

    @FindBy(id = "menu-posts-product")
    private WebElementFacade productsLink;

    public void selectProduct() {
        clickOn(productsLink);
    }

}
