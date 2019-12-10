package com.shopify.store;


/**
 * FruitProduct Products
 */
public class FruitProduct implements Product{
    private ProductType productType;
    private String fruitName;
    private long price;
    private int quantity;

    /**
     *
     * @param fruitName takes in the fruitName and in the future would implement unique SKU
     * @param quantity how many of the fruit product
     */
    public FruitProduct (String fruitName, int quantity) {
        this.fruitName = fruitName.toLowerCase();
        this.quantity = quantity;
        setPrice(fruitName.toLowerCase());
        setProductType(ProductType.FRUIT);
    }

    public void setPrice(String fruitName) {
        switch(fruitName.toLowerCase()) {
            case "grapes":
                this.price = 5;
                break;
            case "apples":
                this.price = 3;
                break;
            case "peaches":
                this.price = 7;
                break;
            default:
                throw new IllegalArgumentException("this fruit does not exist");
        }
    }

    public String getProductName() {
        return fruitName;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getProductQuantity() {
        return quantity;
    }

    public long getPrice() {
        return price;
    }
}