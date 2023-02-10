package org.fasttrackit.qa4.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import utils.Constants;

public class LoginSteps extends BaseSteps{

   @Step
   public void navigateToLoginPage() {
       homePage.clickOnAccountLink();
   }

    @Step
    public void typeUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void typePassword(String password) {
       loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
       loginPage.clickLoginButton();
    }
    @Step
    public void userIsLoggedInSuccessful(){

       accountPage.userIsLoggedIn(Constants.USER_NAME);
    }


    @Step
    public void checkErrorMessage(String errorMessage) {
        Assert.assertTrue(loginPage.getErrorMessage().contains(errorMessage));
    }

}
