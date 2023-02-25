package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class ProductAdminPage extends BasePage {


    @FindBy(css = "body")
    private WebElementFacade body;

    @FindBy(css = "div .page-title-action:nth-child(2)")
    private WebElementFacade addNewProductButton;

    @FindBy(id = "title")
    private WebElementFacade titleProductField;

    @FindBy(id = "_regular_price")
    private WebElementFacade regularPriceField;

    @FindBy(id = "publish")
    private WebElementFacade publishButton;

    @FindBy(id = "wp-admin-bar-site-name")
    private WebElementFacade backToSiteLink;


    public void selectAddNewProduct() {
        clickOn(addNewProductButton);
    }

    public void setTitleProductField(String value) {
        typeInto(titleProductField, value);
    }

    public void setRegularPriceField(String value) {
        typeInto(regularPriceField, value + Keys.ENTER);
    }

    public void publishProduct() {
        body.sendKeys(Keys.CONTROL, Keys.HOME);
        clickOn(publishButton);
    }

    public void returnHomepage() {
        clickOn(backToSiteLink);
    }
}
