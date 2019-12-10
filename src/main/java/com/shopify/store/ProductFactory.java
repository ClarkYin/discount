package com.shopify.store;

public interface ProductFactory {
    Product createProduct();
    DiscountStrategy createDiscount();
}
