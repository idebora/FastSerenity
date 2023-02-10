package org.fasttrackit.qa4.features;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class LoginParameterizedTest extends BaseTest {

    private final String email;
    private final String password;
    private final String errorMessage;

    public LoginParameterizedTest(String email, String password, String errorMessage) {
        super();
        this.email = email;
        this.password = password;
        this.errorMessage = errorMessage;
    }

    @TestData(columnNames = "Email, Password, ErrorMessage")
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
            { "",         "",              "Username is required."},
            { "",          "12abb",        "Username is required."},
            { "eli.",      "",             "The password field is empty."},
            { "@mail.com", "1212",         "Invalid username. Lost your password?"}
        });
    }


    @Test
    public void loginWithInvalidData() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(email);
        loginSteps.typePassword(password);
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage(errorMessage);
    }
}
