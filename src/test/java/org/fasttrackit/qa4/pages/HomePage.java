package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

    @FindBy(css = "#menu-item-122 a")
    private WebElementFacade accountLink;

    @FindBy(css = "#menu-item-123 a")
    private WebElementFacade shopLink;

    @FindBy(css = "#menu-item-124 a")
    private WebElementFacade cartLink;

    @FindBy(css = "#menu-item-125 a")
    private WebElementFacade checkoutLink;


    public void clickOnAccountLink() {
        clickOn(accountLink);
    }

    public void clickOnShopLink() {
        clickOn(shopLink);
    }

    public void clickOnCartLink() {
        clickOn(cartLink);
    }

    public void clickOnCheckoutLink() {
        clickOn(checkoutLink);
    }

}
