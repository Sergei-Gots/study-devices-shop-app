package com.sergeigots.study.devicesshop;


import java.time.LocalDate;

public interface ShopAssistant {
    /**
     *
     * @return the created Customer's instance  or null if there hasn't been a customer created.
     */
    public Customer createCustomer();
    public Product createProduct();
    public Purchase createPurchase();
    public Product getProduct(int id);
    public Customer getCustomer(int id);
    public Purchase getPurchase(int id);
    public void printCustomers();
    public void printProducts();
    public void printPurchases();

}
