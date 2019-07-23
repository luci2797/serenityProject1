package com.steps.serenity;

import com.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps {

    private HeaderPage headerPage;

    @Step
    public void isOnHomepage() {
        headerPage.open();
    }

    @Step
    public void loginFromHomepage() {
        headerPage.clickOnAccountButton();
        headerPage.clickOnLoginFromAccountSublist();
    }

    @Step
    public void shouldBeOnTheLoginPage() {
        Assert.assertTrue(headerPage.containsText("LOGIN OR CREATE AN ACCOUNT"));
    }
}