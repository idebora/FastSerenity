package org.fasttrackit.qa4.features;

import org.junit.Test;
import utils.Constants;

public class AdminTest extends BaseTest {


    @Test
    public void loginAsAdminAndAddAProductTest() {

        String productName = "Tricou verde " + getTimestamp();
        adminSteps.goToAdminPage();
        adminSteps.login(Constants.ADMIN_EMAIL, Constants.ADMIN_PASS);
        adminSteps.selectAddNewProduct();
        adminSteps.typeProductDetails(productName);
        adminSteps.backToHomePage();
        searchSteps.verifyOneNewProduct(productName);

    }
}
