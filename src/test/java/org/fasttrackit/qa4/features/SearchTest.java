package org.fasttrackit.qa4.features;

import org.junit.Test;
import utils.Constants;

public class SearchTest extends BaseTest {

    @Test
    public void noSearchResultsTest() {
        searchSteps.verifyResult("admin");
    }

    @Test
    public void oneSearchResultTest() {
        searchSteps.verifyOneResult("grouped");
    }

    @Test
    public void multipleSearchResultsTest() {
        searchSteps.keywordInProductList("Beanie");
    }

    @Test
    public void searchAndAddReviewForAProductTest() {
        String review = "Good product!" + getTimestamp();
        searchSteps.searchForKeyword("Album");
        searchSteps.goToReviews();
        searchSteps.selectFiveStarsForReview();
        searchSteps.typeReviewDetails(review, Constants.USER_NAME, Constants.USER_EMAIL);
        searchSteps.verifyReview(review);
    }

    @Test
    public void verifyPriceDescendingTest() {
        searchSteps.searchForKeyword("h");
        searchSteps.sortProductByPrice();
        searchSteps.productsAreSortedByPriceDescending();
    }
}
