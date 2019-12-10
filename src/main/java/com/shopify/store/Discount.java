package com.shopify.store;

import java.math.BigDecimal;

/**
 * Discount uses different Discount strategies
 */
public class Discount {
    private DiscountStrategy strategy;

    public Discount(DiscountStrategy strategy){
        this.strategy = strategy;
    }

    public BigDecimal applyDiscount(long price, int quantity, double percentage){
        return strategy.applyDiscount(price,quantity,percentage);
    }
}
