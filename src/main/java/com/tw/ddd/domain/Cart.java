package com.tw.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartProduct> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        CartProduct cartProduct = new CartProduct(product, quantity);
        products.add(cartProduct);
    }

    public void addProduct(Product product) {
        addProduct(product, 1);
    }
}
