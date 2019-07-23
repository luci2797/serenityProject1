package com.steps.serenity;

import com.pages.BillingPage;
import net.thucydides.core.annotations.Step;

public class BillingInformationSteps {
    BillingPage billingPage;

    @Step
    public void fillInformation() {
        billingPage.fillInBillingInfo();
    }
}
