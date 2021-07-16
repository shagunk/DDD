package com.tw.ddd;

import com.tw.ddd.domain.Cart;
import com.tw.ddd.domain.Product;

public class ECommerce {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product iPadPro = new Product("IPad Pro");
        Product heroInkPen = new Product("Hero ink Pen");
        Product gmCricketBat = new Product("GM Cricket bat");
        cart.addProduct(iPadPro);
        cart.addProduct(heroInkPen);
        cart.addProduct(gmCricketBat,2);
    }
}
