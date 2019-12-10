package com.shopify.store;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *  Application here where one can enter and add in product, we can also input an ENUM check in the future to look at categories of products
 */
public class Application {
    public static BigDecimal cart (ArrayList<FruitProduct> cartList) {
        var discountZero = new Discount(new DiscountZeroStrategy());
        var discountBOGO = new Discount(new DiscountBOGOStrategy());
        var discountPercent = new Discount(new DiscountPercentageStrategy());
       BigDecimal total = new BigDecimal(0);
       for (int i = 0; i < cartList.size(); i++) {
           FruitProduct product = cartList.get(i);
           if(product.getProductName().equalsIgnoreCase("apples") && product.getProductQuantity() >= 2) {
                total = total.add(discountPercent.applyDiscount(product.getPrice(), product.getProductQuantity(), 0.2));
           } else if(product.getProductName().equalsIgnoreCase("grapes") && product.getProductQuantity() >= 2) {
               total = total.add(discountBOGO.applyDiscount(product.getPrice(), product.getProductQuantity(),0.5));
           }
           else {
               total = total.add(discountZero.applyDiscount(product.getPrice(), product.getProductQuantity(),1));
           }
       }
       return total;
    }
    public static void main(String[] args) {
        /*
            [ ['grapes', 1], ['apples', 1], ['peaches', 1]] => 15
            [ ['grapes', 2], ['apples', 2], ['peaches', 1]] => 16.8 (5+(0.8*2*3)+7)
            [ ['grapes', 3], ['apples', 5], ['peaches', 2]] => 36
            [ ['grapes', 7], ['apples', 7], ['peaches', 7]] => 85.8
         */

        ArrayList<FruitProduct> cart1 = new ArrayList<>();
        cart1.add(new FruitProduct("apples", 1));
        cart1.add(new FruitProduct("grapes", 1));
        cart1.add(new FruitProduct("peaches", 1));
        ArrayList<FruitProduct> cart2 = new ArrayList<>();
        cart2.add(new FruitProduct("apples", 2));
        cart2.add(new FruitProduct("grapes", 2));
        cart2.add(new FruitProduct("peaches", 1));
        ArrayList<FruitProduct> cart3 = new ArrayList<>();
        cart3.add(new FruitProduct("apples", 5));
        cart3.add(new FruitProduct("grapes", 3));
        cart3.add(new FruitProduct("peaches", 2));
        ArrayList<FruitProduct> cart4 = new ArrayList<>();
        cart4.add(new FruitProduct("apples", 7));
        cart4.add(new FruitProduct("grapes", 7));
        cart4.add(new FruitProduct("peaches", 7));
        System.out.println("your total is " + cart(cart1) + " for cart 1");
        System.out.println("your total is " + cart(cart2) + " for cart 2");
        System.out.println("your total is " + cart(cart3) + " for cart 3");
        System.out.println("your total is " + cart(cart4) + " for cart 4");
    }
}
