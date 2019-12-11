package com.shopify.store;

public class LineItem {
    Product product;
    int quantity;
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
