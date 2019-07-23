package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.dev.evozon.com/")
public class LoginPage extends PageObject {

    public LoginPage (){
        super();
    }

    @FindBy(css = "input[title='Email Address']")
    private WebElementFacade emailAddressField;

    @FindBy(css = "input[title='Password']")
    private WebElementFacade passwordField;

    @FindBy(css = "button[title='Login']")
    private WebElementFacade loginButton;

    public void inputEmailValueInField(){
        emailAddressField.waitUntilVisible().sendKeys(Constants.USER_EMAIL);
    }

    public void inputPasswordValueInField(){
        passwordField.waitUntilVisible().sendKeys(Constants.USER_PASS);
    }

    public void pressLoginButton(){
        loginButton.waitUntilClickable().click();
    }
}
