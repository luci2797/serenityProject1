package com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShippingMethodPage extends PageObject {

    @FindBy(css = "#s_method_freeshipping_freeshipping")
    private WebElementFacade radioButtonFreeShipping;

    @FindBy(css = "#s_method_flatrate_flatrate")
    private WebElementFacade radioButtonFlateRateShipping;

    @FindBy(css = ".gift-messages h3")
    private WebElementFacade giftMessage;

    @FindBy(css = "#allow_gift_messages")
    private WebElementFacade buttonEnableGiftOption;
}
