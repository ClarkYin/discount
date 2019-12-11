package com.shopify.store;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<LineItem> items;
    private Discount discountZero;
    private Discount discountBOGO;
    private Discount discountPercent;
    private List<ProductCatalog> productCatalog;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.discountZero = new Discount(new DiscountZeroStrategy());
        this.discountBOGO = new Discount(new DiscountBOGOStrategy());
        this.discountPercent = new Discount(new DiscountPercentageStrategy());
        this.productCatalog = new ArrayList<>();
    }

    public void addItem(String productName, int quantity) {
        Product product = new Product(new FruitProduct(productName));
        if(productCatalog != null) {
            if(isExist(productName)) {
                LineItem anItem = new LineItem(product, quantity);
                this.items.add(anItem);
            } else {
                throw new IllegalArgumentException("item entered does not exist in the product catalog");
            }
        } else {
            throw new IllegalArgumentException("product catalog has not been initialized");
        }
    }

    public boolean isExist(String productName) {
        boolean isExist = productCatalog.stream().anyMatch(productCatalog -> productCatalog.getProduct().getProductName().equalsIgnoreCase(productName));
        return isExist;
    }

    public void setProductCatalogueList(List<ProductCatalog> productCatalogList) {
        this.productCatalog = productCatalogList;
    }
    public void applyDiscount() {
        /*
            I would use the different concerete strategy discounts and apply them to my products if they satisfy the product catalogue's Constraint
            
         */
    }
    public BigDecimal getTotal(){
        //if (items.co)
        BigDecimal total = new BigDecimal(0);
        return total;
    }
}
