package com.shopify.store;

import java.math.BigDecimal;

/**
 * Discount Strategy Interface
 */
public interface DiscountStrategy {
    BigDecimal applyDiscount(long price, int quantity, double percentage);
    //long getDiscountAmt(String product);
}
