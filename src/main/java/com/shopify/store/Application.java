package com.shopify.store;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *  Application here where one can enter and add in product, we can also input an ENUM check in the future to look at categories of products
 */

/*
        var discountZero = new Discount(new DiscountZeroStrategy());
        var discountBOGO = new Discount(new DiscountBOGOStrategy());
        var discountPercent = new Discount(new DiscountPercentageStrategy());
       BigDecimal total = new BigDecimal(0);
       for (int i = 0; i < cart.size(); i++) {
           FruitProduct product = cart.get(i);
           if(product.getProductName().equalsIgnoreCase("apples") && product.getProductQuantity() >= 2) {
                total = total.add(discountPercent.applyDiscount(product.getPrice(), product.getProductQuantity(), 0.2));
           } else if(product.getProductName().equalsIgnoreCase("grapes") && product.getProductQuantity() >= 2) {
               total = total.add(discountBOGO.applyDiscount(product.getPrice(), product.getProductQuantity(),0.5));
           }
           else {
               total = total.add(discountZero.applyDiscount(product.getPrice(), product.getProductQuantity(),1));
           }
       }

               List<FruitProduct> cart1 = new ArrayList<>();
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
 */
public class Application {
    public static void main(String[] args) {
        /*
            [ ['grapes', 1], ['apples', 1], ['peaches', 1]] => 15
            [ ['grapes', 2], ['apples', 2], ['peaches', 1]] => 16.8 (5+(0.8*2*3)+7)
            [ ['grapes', 3], ['apples', 5], ['peaches', 2]] => 36
            [ ['grapes', 7], ['apples', 7], ['peaches', 7]] => 85.8
         */
        List<ProductCatalog> productCatalog = new ArrayList<>();
        var apple = new Product(new FruitProduct("apple"));
        var grapes = new Product(new FruitProduct("grapes"));
        var peaches = new Product(new FruitProduct("peaches"));
        productCatalog.add(new ProductCatalog(apple,3, 2,0.2));
        productCatalog.add(new ProductCatalog(grapes,5,2,0.5));
        productCatalog.add(new ProductCatalog(peaches,7,0,0));
        var cart = new ShoppingCart();
        cart.setProductCatalogueList(productCatalog);
        cart.addItem("apple",3);
        /*
        cart.setProductCatalogue("apple",3);
        cart.setProductCatalogue("grapes",5);
        cart.setProductCatalogue("peaches",7);
         */
        //cart1.forEach((cart) -> invoice(cart));
    }
}
