package org.fasttrackit.qa4.pages;

import com.google.common.collect.Lists;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".woocommerce-breadcrumb")
    private WebElementFacade searchResultsText;

    @FindBy(css = ".woocommerce-loop-product__title")
    private List<WebElementFacade> listOfProductNames;

    @FindBy(css = ".product_title")
    private WebElementFacade productTitle;

    @FindBy(css = ".woocommerce-product-details__short-description")
    private WebElementFacade productShortDescription;

    @FindBy(css = "#tab-description p")
    private WebElementFacade productDescription;

    @FindBy(css = ".orderby")
    private WebElementFacade sortByDropdown;

    @FindBy(css = "ins>span.amount,span.price>span.amount:first-child")
    private List<WebElementFacade> pricesList;

    public String getResultName() {
        return searchResultsText.getText();
    }

    public String getProductResultTitle() {
        return productTitle.getText();
    }

    public String getProductShortDescription() {
        return productShortDescription.getText();
    }

    public String getProductDescription() {
        return productDescription.getText();
    }

    public int getProductListSize() {
        return listOfProductNames.size();
    }

    public boolean keywordInProductList(String keyword) {
        waitFor(listOfProductNames.get(0));

        for (WebElementFacade product : listOfProductNames) {
            if (!product.getText().toLowerCase().contains(keyword.toLowerCase()))
                return false;
        }
        return true;
    }

    public void selectPriceFromDropdown() {
        sortByDropdown.selectByValue("price-desc");
    }

    private List<Float> arrangePrices(List<Float> input) {
        int columns = 4;
        List<Float> result = new ArrayList<>();
        List<List<Float>> partitions = Lists.partition(input, columns);

        for (int column = 0; column < partitions.size(); column++) {
            for (int row = 0; row < partitions.get(column).size(); row++) {
                result.add(partitions.get(row).get(column));
            }
        }
        return result;
    }

    private List<Float> getFloatPrices() {
        List<Float> result = new ArrayList<>();
        for (WebElementFacade priceElement : pricesList) {
            String strPrice = priceElement.getText();
            result.add(getFloatFromPrice(strPrice));
        }
        return result;
    }

    public boolean isPriceDescending() {
        List<Float> prices = getFloatPrices();
        prices = arrangePrices(prices);

        List<Float> pricesSorted = new ArrayList<>(prices);
        pricesSorted.sort(Collections.reverseOrder());

        return prices.equals(pricesSorted);

    }


}
