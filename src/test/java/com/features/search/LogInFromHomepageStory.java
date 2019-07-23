package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
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
    public void navigatingToLoginPage() {
        loginSteps.isOnHomepage();
        loginSteps.loginFromHomepage();
        loginSteps.shouldBeOnTheLoginPage();
    }
}