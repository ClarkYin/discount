package com.shopify.store;


public class ProductCatalog {
    Product product;
    double unitPrice;
    int quantityConstraint;
    double percentage;

    public ProductCatalog(Product product, double unitPrice, int quantityConstraint, double percentage) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantityConstraint = quantityConstraint;
        this.percentage = percentage;
    }

    public Product getProduct() {
        return product;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getQuantityConstraint() {
        return quantityConstraint;
    }
}
