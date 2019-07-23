package com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
@DefaultUrl("http://qa1.dev.evozon.com/checkout/onepage/")
public class PaymentInformationPage extends PageObject {

    @FindBy(css = "#shipping_method-progress-opcheckout .complete:nth-child(2) .price")
    private WebElementFacade shippingPriceCheck;

    @FindBy(css = "#dt_method_cashondelivery")
    private WebElementFacade paymentMessage;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade continuePaymentInformation;


    public WebElementFacade getShippingPriceCheck() {
        return shippingPriceCheck;
    }

    public WebElementFacade getPaymentMessage() {
        return paymentMessage;
    }

    public void pressContinue()
    {
        continuePaymentInformation.click();
    }
}

