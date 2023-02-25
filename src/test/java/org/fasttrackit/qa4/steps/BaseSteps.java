package org.fasttrackit.qa4.steps;

import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.qa4.pages.*;


public class BaseSteps extends ScenarioSteps {

    protected AccountPage accountPage;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected ShopPage shopPage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;

    protected SearchResultsPage searchResultsPage;

    protected ProductDetailPage productDetailPage;
    protected BlogPage blogPage;

    protected ErrorPage errorPage;
    protected AdminPage adminPage;

    protected LoginAdminPage loginAdminPage;

    protected ProductAdminPage productAdminPage;
}
