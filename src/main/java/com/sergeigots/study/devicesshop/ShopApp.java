package com.sergeigots.study.devicesshop;

import java.awt.*;
import java.time.Month;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Hello world!
 *
 */
public class ShopApp  {

    static {
        System.out.println("\nHello World!\n" +
                "Welcome to our new Devices Shop!:)\n");
    }
    public static void main( String[] args )
    {
        Shop shop = new Shop();
        ShopAssistant shopAssistant = shop;

        Customer customer = shopAssistant.createCustomer();
        if(customer != null) {
            customer.printInfo();
        }

        Product product = shopAssistant.createProduct();
        if(product != null) {
            product.printInfo();
        }
    }

}
