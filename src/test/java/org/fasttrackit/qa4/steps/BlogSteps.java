package org.fasttrackit.qa4.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import utils.Messages;

public class BlogSteps extends BaseSteps {

    @Step
    public void navigateToPostPage(int index) {
        homePage.clickTitlePostLink(index);
        waitABit(2000);
    }

    @Step
    public void typeComment(String keyword) {
        blogPage.setCommentField(keyword);
    }

    @Step
    public void typeAuthorDetailsAndSubmit(String author, String email, String url) {
        blogPage.setAuthorField(author);
        blogPage.setEmailField(email);
        blogPage.setUrlField(url);
        blogPage.clickSubmit();
        waitABit(100);
    }

    @Step
    public void verifyComment(String comment) {
        Assert.assertEquals(comment, blogPage.getArticlesContent(blogPage.getLastArticleIndex()));
    }

    @Step
    public void verifyError() {
        System.out.println(errorPage.getErrorMsg());
        Assert.assertTrue(Messages.errorCommentMsg.contains(errorPage.getErrorMsg()));
    }

}
