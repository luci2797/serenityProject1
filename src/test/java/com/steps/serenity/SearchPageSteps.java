package com.steps.serenity;

import com.pages.HeaderPage;
import com.utils.Constants;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchPageSteps {

    public SearchPageSteps() {
    }

    private HeaderPage headerPage;

    @Step
    public void isOnHomepage() {
        headerPage.open();
    }

    @Step
    public void fillingSearchField() {
        headerPage.typeInSearchField(Constants.SEARCH_PROD);
    }

    @Step
    public void shouldBeOnSearchResultsPage() {
        Assert.assertTrue(headerPage.containsText("SEARCH RESULTS FOR '" + Constants.SEARCH_PROD + "'"));
    }
}
