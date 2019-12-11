package com.shopify.store;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Discount Buy one get one free Strategy
 */
public class DiscountBOGOStrategy implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(long price, int quantity, double percentage) {
        return new BigDecimal(((quantity/2) + (quantity % 2)) * price)
                        .setScale(1, RoundingMode.HALF_UP)
                        .stripTrailingZeros();
    }
}
