package org.fasttrackit.qa4.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

import java.util.List;

public class BlogPage extends BasePage {

    @FindBy(id = "comment")
    private WebElementFacade commentField;
    @FindBy(id = "author")
    private WebElementFacade authorField;
    @FindBy(id = "email")
    private WebElementFacade emailField;
    @FindBy(id = "url")
    private WebElementFacade urlField;

    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;

    @FindBy(css = "article:last-child .comment-content")
    private List<WebElementFacade> articlesContentsList;

    public void setCommentField(String value) {
        typeInto(commentField, value + Keys.TAB);
    }

    public void setAuthorField(String value) {
        typeInto(authorField, value + Keys.TAB);
    }

    public void setEmailField(String value) {
        typeInto(emailField, value + Keys.TAB);
    }

    public void setUrlField(String value) {
        typeInto(urlField, value + Keys.TAB);
    }

    public void clickSubmit() {
        clickOn(postCommentButton);
    }

    public int getLastArticleIndex() {
        int size = articlesContentsList.size();
        return size - 1;
    }

    public String getArticlesContent(int index) {
        return articlesContentsList.get(index).getText();
    }

}
