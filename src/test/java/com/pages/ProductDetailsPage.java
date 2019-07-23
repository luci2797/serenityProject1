package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class ProductDetailsPage extends PageObject {

    @FindBy(css = "#msrp-popup-553oWeJzVVjR2rtBHnvB8Di")
    private WebElementFacade clickForPriceButton;

    @FindBy(css = "#map-popup")
    private WebElementFacade hiddenPriceBox;

    @FindBy(css = " .product-shop .product-name")
    private WebElementFacade productName;

    @FindBy(css = "#configurable_swatch_color>li")
    private List<WebElementFacade> colorsList;

    @FindBy(css = "#configurable_swatch_size>li")
    private List<WebElementFacade> sizeList;

    public void getColors(){

    }

}
