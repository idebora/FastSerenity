package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailPage extends BasePage {

    @FindBy(id = "tab-title-reviews")
    private WebElementFacade reviewLink;

    @FindBy(css = ".comment-form-rating .stars a:last-of-type")
    private WebElementFacade fiveStarsReviewButton;

    @FindBy(id = "comment")
    private WebElementFacade reviewField;

    @FindBy(id = "author")
    private WebElementFacade reviewAuthorField;

    @FindBy(id = "email")
    private WebElementFacade reviewEmailField;

    @FindBy(id = "submit")
    private WebElementFacade reviewSubmitButton;

    @FindBy(css = ".commentlist .description")
    private List<WebElementFacade> reviewsList;

    public void clickReviewLink() {
        clickOn(reviewLink);
    }

    public void click5StarsReview() {
        clickOn(fiveStarsReviewButton);
    }

    public void typeReviewComment(String review) {
        typeInto(reviewField, review);
    }

    public void typeReviewAuthor(String author) {
        typeInto(reviewAuthorField, author);
    }

    public void typeReviewAuthorEmail(String email) {
        typeInto(reviewEmailField, email);
    }

    public void clickSubmit() {
        clickOn(reviewSubmitButton);
    }

    public String getReviewText(int index) {
        return reviewsList.get(index).getText();
    }

    public int getReviewListSize() {
        return reviewsList.size();
    }

}
