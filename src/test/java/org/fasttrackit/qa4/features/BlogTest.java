package org.fasttrackit.qa4.features;

import org.junit.Test;
import utils.Constants;

public class BlogTest extends BaseTest {

    @Test
    public void addACommentForPostTest() {
        int index = 0;
        String comment = "Wonderful idea!Bravo!!!" + getTimestamp();

        blogSteps.navigateToPostPage(index);
        blogSteps.typeComment(comment);
        blogSteps.typeAuthorDetailsAndSubmit(Constants.USER_NAME, Constants.USER_EMAIL, Constants.BASE_URL);
        blogSteps.verifyComment(comment);

        blogSteps.typeComment(comment);
        blogSteps.typeAuthorDetailsAndSubmit(Constants.USER_NAME, Constants.USER_EMAIL, Constants.BASE_URL);
        blogSteps.verifyError();
    }

}
