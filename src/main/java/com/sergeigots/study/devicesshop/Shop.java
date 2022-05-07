package com.sergeigots.study.devicesshop;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Shop implements ShopAssistant {

    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Purchase> purchaces = new ArrayList<>();

    public Shop(){
        loadShopImaginatedHistory();
    }

    private void loadShopImaginatedHistory(){
        customers.add(new Customer("van Rijn", "Rembrandt", "Harmenszoon",
                LocalDate.of(1606, Month.JULY, 15)));
        customers.add(new Customer("Rubens", "Peter", "Paul",
                LocalDate.of(1577, Month.JUNE, 28)));
        customers.add(new Customer("Vermeer", "", "Johannes",
                LocalDate.of(1632, Month.OCTOBER, 31)));
        customers.add(new Customer("Steen", "Jan", "",
                1626));
        customers.add(new Customer("Brueghel", "Pieter", "the Elder",
                1525));
        customers.add(new Customer("Brueghel", "Jan", "the Elder",
                1568));
        customers.add(new Customer("Heda", "Willem", "Claesz.",
                LocalDate.of(1593, Month.DECEMBER, 14)));
        customers.add(new Customer("Heda", "Willem", "Claesz.",
                LocalDate.of(1593, Month.DECEMBER, 14)));


        products.add(new Product("Apple", "IPhone", "Pro 13",
                Color.DARK_GRAY,
                LocalDate.of(2022,Month.MAY,07),
                1159.00));
        products.add(new Product("Apple", "IPhone", "13",
                Color.WHITE,
                LocalDate.of(2022,Month.MAY,07),
                909.00));
        products.add(new Product("Apple", "IPhone", "mini",
                Color.BLACK,
                LocalDate.of(2022,Month.MAY,07),
                809.00));
        products.add(new Product("Apple", "IPhone", "SE",
                Color.DARK_GRAY,
                LocalDate.of(2022,Month.MAY,07),
                529.00));
        products.add(new Product("Apple", "IPhone", "SE",
                Color.WHITE,
                LocalDate.of(2022,Month.MAY,07),
                529.00));
        products.add(new Product("Apple", "IPhone", "SE",
                Color.RED,
                LocalDate.of(2022,Month.MAY,07),
                529.00));
        products.add(new Product("Apple", "IPad", "Pro 13",
                Color.DARK_GRAY,
                LocalDate.of(2022,Month.MAY,07),
                1159.00));

        ArrayList <Lot> purchase1 = new ArrayList<>();
        purchase1.add(Lot.of(getProduct(0), 1));
        purchaces.add(
                new Purchase(LocalDateTime.of(2022, Month.MAY, 07, 17, 05),
                        0, purchase1));
    }


    public void createCustomer(){

    }

    public void updateCustomer(){

    }

    public Customer getCustomer(int id){

        return customers.get(id);
    }

    public void createProduct(){

    }

    public void updateProduct(){

    }

    public Product getProduct(int id){

        return products.get(id);
    }

    public void createPurchase(){

    }

    public void showCustomerInfo(int customerId){

    }

    public void showProductInfo(int productId){

    }

    public void showPurchaseId(int purchaseId){

    }

    public void showCustomersList(){

    }

    public void showProductsList(){

    }

    public void showPurchasesList(){

    }
}
