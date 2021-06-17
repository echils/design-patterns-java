package com.github.pattern.responsibility;

/**
 * ResponsbilityClient
 *
 * @author echils
 * @since 2020-01-18 19:09:22
 */
public class ResponsbilityClient {

    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(800);
        Handler handler = new FirstHandler("firstHandler");
        handler.setNextHanler(new SecondHandler("secondHandler"));
        handler.handle(request);
    }
}
