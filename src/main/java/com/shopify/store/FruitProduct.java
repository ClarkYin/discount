package com.shopify.store;

public class FruitProduct implements ProductStrategy{
    String fruitProduct;

    public FruitProduct(String fruitProduct) {
        this.fruitProduct = fruitProduct;
    }
    @Override
    public String getProductName() {
        return this.fruitProduct;
    }
}
