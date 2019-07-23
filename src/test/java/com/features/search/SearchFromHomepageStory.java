package com.features.search;

import com.steps.serenity.SearchPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchFromHomepageStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public SearchPageSteps searchPageSteps;

    @Test
    public void searchingForAGivenProduct(){
        searchPageSteps.isOnHomepage();
        searchPageSteps.fillingSearchField();
        searchPageSteps.shouldBeOnSearchResultsPage();
    }
}
