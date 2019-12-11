package com.shopify.store;


import java.math.BigDecimal;

/**
 * FruitProduct Products
 */
public class Product {
    ProductStrategy product;

    public Product(ProductStrategy product) {
        this.product = product;
    }
    /**
     *
     */
    public String getProductName() {
        return product.getProductName();
    }

}