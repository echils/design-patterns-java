package com.github.pattern.responsibility;

/**
 * PurchaseRequest
 *
 * @author echils
 * @since 2020-01-18 15:15:15
 */
public class PurchaseRequest {

    private int price;

    public PurchaseRequest(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
