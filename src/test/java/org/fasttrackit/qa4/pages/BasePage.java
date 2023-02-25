package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {


    public float getFloatFromPrice(String priceWithCurrency) {
        String price = priceWithCurrency.split(" ")[0];
        return Float.parseFloat(price.replace(",", "."));
    }
}
