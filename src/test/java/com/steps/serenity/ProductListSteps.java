package com.steps.serenity;

import com.pages.ProductListPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ProductListSteps {

    ProductListPage productListPage;

    @Step
    public void openPage(){
        productListPage.open();
    }

    @Step
    public void getProducts(){
        List<WebElementFacade> products = productListPage.displayProducts();
        System.out.println("this is the number of products found:" + products.size());
        Assert.assertTrue(products.size()>0);
    }

}
