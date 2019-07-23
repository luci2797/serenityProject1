package com.steps.serenity;

import com.pages.HeaderPage;
import com.pages.LoginPage;
import com.utils.Constants;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps {

    private HeaderPage headerPage;
    private LoginPage loginPage;

    @Step
    public void isOnHomepage() {
        headerPage.open();
    }

    @Step
    public void reachLoginFromHomepage() {
        headerPage.clickOnAccountButton();
        headerPage.clickOnLoginFromAccountSublist();
    }

    @Step
    public void shouldBeOnTheLoginPage() {
        Assert.assertTrue(headerPage.containsText(Constants.LOGIN_PAGE_TITLE));
    }

    @Step
    public void fillingLoginRequiredFields(){
        loginPage.inputEmailValueInField();
        loginPage.inputPasswordValueInField();
        loginPage.pressLoginButton();
    }

    @Step
    public void shouldBeOnTheAccountPage(){
        Assert.assertTrue(loginPage.containsText(Constants.USER_NAME));
    }
}