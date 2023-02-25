package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = "#menu-item-122 a")
    private WebElementFacade accountLink;

    @FindBy(css = "#menu-item-123 a")
    private WebElementFacade shopLink;

    @FindBy(css = "#menu-item-124 a")
    private WebElementFacade cartLink;

    @FindBy(css = "#menu-item-125 a")
    private WebElementFacade checkoutLink;

    @FindBy(css = ".header-search-button")
    private WebElementFacade searchButton;

    @FindBy(css = "[title='Search for:']")
    private WebElementFacade searchField;

    @FindBy(css = "#main .post .post-img-wrap")
    private List<WebElementFacade> titlesPostLinks;

    @FindBy(css = "#meta-2 :nth-child(2) a")
    private WebElementFacade adminLoginLink;


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

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void setSearchField(String value) {
        typeInto(searchField, value);
        searchField.sendKeys(Keys.ENTER);
    }

    public void clickTitlePostLink(int index) {
        clickOn(titlesPostLinks.get(index));
    }

    public void clickOnAdminLink() {
        clickOn(adminLoginLink);
    }

}
