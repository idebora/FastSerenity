package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ErrorPage extends BasePage {

    @FindBy(css = "#error-page p:nth-child(2)")
    private WebElementFacade errorMessage;


    public String getErrorMsg() {
        return errorMessage.getText();
    }

}
