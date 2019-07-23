package com.steps.serenity;

import com.pages.HeaderPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps {

    HeaderPage headerPage;

    @Step
    public void loginFromHomepage(){
        headerPage.clickOnAccountButton();
        headerPage.clickOnLoginFromAccountSublist();
    }

    @Step
    public void registerFromHomepage(){
        headerPage.clickOnAccountButton();
        headerPage.clickOnRegisterFromAccountSublist();
    }

}