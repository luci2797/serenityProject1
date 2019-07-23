package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;

@RunWith(SerenityRunner.class)
public class LogInFromHomepageStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    @Test
    public void completingLoginFromHomepage(){
        loginSteps.isOnHomepage();
        loginSteps.reachLoginFromHomepage();
        loginSteps.shouldBeOnTheLoginPage();
        loginSteps.fillingLoginRequiredFields();
        loginSteps.shouldBeOnTheAccountPage();
    }
}