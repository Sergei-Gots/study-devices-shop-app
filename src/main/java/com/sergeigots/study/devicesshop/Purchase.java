package com.sergeigots.study.devicesshop;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase implements ShopDataEntity {

    protected static int purchasesCount;
    protected int id;
    protected LocalDateTime dateTime;
    protected int customerId;
    ArrayList<Lot> lots;

    protected double sum;


    public static Purchase getPurchase(int id){
        return ShopApp.getShop().getPurchase(id);
    }

    public static int getPurchasesCount(){
        return purchasesCount;
    }
    public Purchase(LocalDateTime dateTime, int customerId,
                    ArrayList<Lot> lots){
        id = purchasesCount++;
        this.customerId = customerId;
        this.dateTime = dateTime;
        this.lots = lots;
        for (Lot lot:lots) {
            sum += lot.getSum();
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Purchase info:\n" + this);
        System.out.println();
    }

        public String toString() {
        StringBuilder s = new StringBuilder("Customer: " + Customer.getCustomer(customerId) + ", " +
               "sale date " + dateTime + "\nSold products: ");
        for (Lot lot:lots) {
            s.append("\n\t");
            s.append(lot);
        }
        s.append("\nSum: " + sum);
        return s.toString();
    }
}
