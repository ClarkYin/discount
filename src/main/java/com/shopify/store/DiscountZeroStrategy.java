package com.shopify.store;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Zero discount
 */
public class DiscountZeroStrategy implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(long price, int quantity, double percentage) {
        return new BigDecimal((price * quantity * percentage)).setScale(1, RoundingMode.HALF_UP).stripTrailingZeros();
    }
}
