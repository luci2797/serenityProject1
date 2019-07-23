package com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends PageObject {

    @FindBy(css = "#shipping-buttons-container [title='Continue']")
    private WebElementFacade continueShippingButton;


    public void pressContinue(int shippingChoice) {
        if (shippingChoice == 1) {
            continueShippingButton.click();
        }
    }
}
