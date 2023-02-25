package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopPage extends BasePage {

    @FindBy(css = ".product-type-simple.instock .add_to_cart_button ")
    private List<WebElementFacade> simpleAddLinks;

    @FindBy(css = ".product-type-simple.instock h2")
    private List<WebElementFacade> simpleAddTiles;


    public String getFirstSimpleProductName(int index) {
        return simpleAddTiles.get(index).getText();
    }

    public void addSimpleProduct(int index) {
        clickOn(simpleAddLinks.get(index));
    }

}