package com.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BillingPage extends PageObject {

    @FindBy(css="#billing-address-select")
    private List<WebElementFacade>selectBillingAddress;

    @FindBy(css="[title='Ship to this address']")
    private WebElementFacade radioShipToThisAddress;

    @FindBy(css="[title='Ship to different address']")
    private WebElementFacade getRadioShipToDifferentAddress;

    @FindBy(css="#billing-buttons-container >button")
    private WebElementFacade continueBillingButton;

    /////in momentul inj care dau continue retin adresa ca sa o pot verifica ca se noteaza cum trebuie

    public void setSelectBillingAddress(int index) {
        selectBillingAddress.get(index).click();
    }

    public void fillInBillingInfo() {

        address = selectBillingAddress.get(1).getText();
        radioShipToThisAddress.click();
        shippTo = 1;
        continueBillingButton.click();
        toShippingButton.waitUntilClickable();
        toShippingButton.click();
    }


}
