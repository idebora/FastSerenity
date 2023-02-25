package org.fasttrackit.qa4.steps;

import net.thucydides.core.annotations.Step;

public class AdminSteps extends BaseSteps {


    @Step
    public void goToAdminPage() {
        homePage.clickOnAdminLink();
    }

    @Step
    public void login(String email, String pass) {
        loginAdminPage.setEmailField(email);
        loginAdminPage.setPasswordField(pass);
        loginAdminPage.clickLoginButton();

    }

    @Step
    public void selectAddNewProduct() {
        adminPage.selectProduct();
        productAdminPage.selectAddNewProduct();
    }

    @Step
    public void typeProductDetails(String keyword) {
        productAdminPage.setTitleProductField(keyword);
        productAdminPage.setRegularPriceField("20,00");
        productAdminPage.publishProduct();
    }

    @Step
    public void backToHomePage() {
        productAdminPage.returnHomepage();
    }

}