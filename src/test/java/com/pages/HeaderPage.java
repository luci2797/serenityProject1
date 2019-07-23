package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@DefaultUrl("http://qa1.dev.evozon.com/")
public class HeaderPage extends PageObject {

    @FindBy(css = ".skip-link.skip-account .label")
    private WebElementFacade accountButton;

    @FindBy(css = "a[title = 'Log In']")
    private WebElementFacade logInButton;

    @FindBy(css = "a[title = 'Register']")
    private WebElementFacade registerButton;

    public HeaderPage() {
        super();
    }

    public void clickOnAccountButton() {
        accountButton.waitUntilClickable().click();
    }

    public void clickOnLoginFromAccountSublist() {
        logInButton.waitUntilClickable().click();
    }

    public void clickOnRegisterFromAccountSublist() {
        registerButton.waitUntilClickable().click();
    }
}