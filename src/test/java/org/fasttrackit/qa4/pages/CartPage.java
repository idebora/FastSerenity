package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(css = ".product-name  a")
    private WebElementFacade addedProductName;

    @FindBy(css = ".quantity .qty")
    private List<WebElementFacade> quantityFields;

    @FindBy(css = "td.product-subtotal")
    private List<WebElementFacade> priceFields;


    public String getSingleAddedProductName(){
        String name = addedProductName.getText();
        System.out.println("Product name from Cart" + name);
        return name;
    }

    public String getQuantity(int index){
        return quantityFields.get(index).getAttribute("value");
    }

    public void setNewQuantity(int index, int newQty){
       String qty = Integer.toString(newQty);
       WebElementFacade elem = quantityFields.get(index);
       elem.sendKeys(Keys.DELETE, qty, Keys.ENTER);
    }


    public float getValuePrice(int index){
        String priceWithCurrency = priceFields.get(index).getText();
        return getFloatFromPrice(priceWithCurrency);
    }

}
