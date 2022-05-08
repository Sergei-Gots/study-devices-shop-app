package com.sergeigots.study.devicesshop;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase implements ShopDataEntity {

    protected LocalDateTime dateTime;
    protected int customerId;
    ArrayList<Lot> lots;

    public Purchase(LocalDateTime dateTime, int customerId,
                    ArrayList<Lot> lots){
        this.customerId = customerId;
        this.dateTime = dateTime;
        this.lots = lots;
    }

    @Override
    public void printInfo() {
        System.out.println("Purchase info:");
        System.out.println("Customer: " + ' ' );
        System.out.println("Sale date " + dateTime);
        System.out.println("Sold products: ");
        for (Lot lot:lots) {
            Product product = ShopApp.getShop().getProduct(lot.productId);
            System.out.print("\tProduct: ");
            product.printInfoShort();
            System.out.print(", sell price: " + lot.getSellPrice());
            System.out.println(", amount: " + lot.getItemsCount());
        }
        System.out.println();
    }
}
