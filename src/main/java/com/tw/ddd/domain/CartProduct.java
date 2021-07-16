package com.tw.ddd.domain;

public class CartProduct {
    private Product product;
    private int quantity;

    public CartProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
