package org.fasttrackit.qa4.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {


    @Step
    public void searchForKeyword(String keyword) {
        homePage.clickSearchButton();
        homePage.setSearchField(keyword);
    }

    @Step
    public void verifyResult(String keyword) {
        searchForKeyword(keyword);
        String resultName = searchResultsPage.getResultName();
        Assert.assertTrue(resultName.contains("Search results"));
        Assert.assertEquals(0, searchResultsPage.getProductListSize());
    }

    @Step
    public void verifyOneResult(String keyword) {
        searchForKeyword(keyword);
        String resultName = searchResultsPage.getResultName();
        Assert.assertFalse(resultName.contains("Search results"));
        String title = searchResultsPage.getProductResultTitle();
        String shortDesc = searchResultsPage.getProductShortDescription();
        String description = searchResultsPage.getProductDescription();
        Assert.assertTrue((title.contains(keyword.toUpperCase()) | description.contains(keyword) | shortDesc.contains(keyword)));
    }

    @Step
    public void verifyOneNewProduct(String productName) {
        waitABit(500);
        searchForKeyword(productName);
        String resultName = searchResultsPage.getResultName();
        Assert.assertFalse(resultName.contains("Search results"));
        String title = searchResultsPage.getProductResultTitle();
        Assert.assertTrue(title.contains(productName.toUpperCase()));
    }

    @Step
    public void keywordInProductList(String keyword) {
        searchForKeyword(keyword);
        Assert.assertTrue(searchResultsPage.keywordInProductList(keyword));
    }

    @Step
    public void goToReviews() {
        productDetailPage.clickReviewLink();
    }

    @Step
    public void selectFiveStarsForReview() {
        productDetailPage.click5StarsReview();
    }

    @Step
    public void typeReviewDetails(String review, String author, String email) {
        productDetailPage.typeReviewComment(review);
        productDetailPage.typeReviewAuthor(author);
        productDetailPage.typeReviewAuthorEmail(email);
        productDetailPage.clickSubmit();
    }

    @Step
    public void verifyReview(String review) {
        Assert.assertTrue(productDetailPage.getReviewText(productDetailPage.getReviewListSize() - 1).contains(review));
    }

    @Step
    public void sortProductByPrice() {
        searchResultsPage.selectPriceFromDropdown();
    }

    @Step
    public void productsAreSortedByPriceDescending() {
        Assert.assertTrue("Products not sorted by price descending", searchResultsPage.isPriceDescending());
    }


}
