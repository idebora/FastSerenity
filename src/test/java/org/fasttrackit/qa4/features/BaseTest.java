package org.fasttrackit.qa4.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.qa4.steps.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.Constants;

import java.time.Instant;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected ProductSteps productSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected CheckoutSteps checkoutsteps;

    @Steps
    protected BlogSteps blogSteps;

    @Steps
    protected AdminSteps adminSteps;

    @Before
    public void initTests() {
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }

    public long getTimestamp() {
        return Instant.now().getEpochSecond();
    }

    public String getGUID() {
        return String.valueOf(java.util.UUID.randomUUID());
    }

}
