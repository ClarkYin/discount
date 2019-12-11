package com.shopify.store;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Discount Percentage off strategy
 */
public class DiscountPercentageStrategy implements DiscountStrategy{
    @Override
    public BigDecimal applyDiscount(long price, int quantity, double percentage) {
        return new BigDecimal(price * quantity * (1-percentage)).setScale(1, RoundingMode.HALF_UP).stripTrailingZeros();
    }
}
