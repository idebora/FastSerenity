package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(css = ".product-type-simple.instock .add_to_cart_button ")
    private List<WebElementFacade> simpleAddLinks;

    @FindBy(css = ".product-type-simple.instock h2")
    private List<WebElementFacade> simpleAddTiles;


    public String getFirstSimpleProductName() {
        return simpleAddTiles.get(0).getText();
    }

    public void addSimpleProduct() {
        clickOn(simpleAddLinks.get(0));
    }


}
