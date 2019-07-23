package com.products.tests;

import com.steps.serenity.ProductListSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AddToCartTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    ProductListSteps productListSteps;

    @Test
    public void displayProductsFoundTest(){
        productListSteps.openPage();
        productListSteps.getProducts();
    }
}
