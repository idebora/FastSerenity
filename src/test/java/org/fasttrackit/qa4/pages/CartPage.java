package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class CartPage extends BasePage {

    @FindBy(css = ".quantity .qty")
    private List<WebElementFacade> quantityFields;

    @FindBy(css = "td.product-subtotal")
    private List<WebElementFacade> priceFields;
    @FindBy(css = ".product-name  a")
    private List<WebElementFacade> nameFields;

    public String getProductName(int index) {
        return nameFields.get(index).getText();
    }

    public String getQuantity(int index) {
        return quantityFields.get(index).getAttribute("value");
    }

    public void setNewQuantity(int index, int newQty) {
        String qty = Integer.toString(newQty);
        WebElementFacade elem = quantityFields.get(index);
        elem.sendKeys(Keys.DELETE, qty, Keys.ENTER);
    }

    public float getValuePrice(int index) throws ParseException {
        float result;
        Locale locale = new Locale.Builder().setLanguage(
                Constants.LANGUAGE).setScript(Constants.SCRIPT_LANG).setRegion(Constants.COUNTRY).build();
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        result = numberFormat.parse(priceFields.get(index).getText()).floatValue();
        return result;
    }

}
