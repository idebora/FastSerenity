package org.fasttrackit.qa4.features;

import org.junit.Test;
import utils.Constants;


public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidData(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.userIsLoggedInSuccessful();
    }
}
