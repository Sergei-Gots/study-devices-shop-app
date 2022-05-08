package com.sergeigots.study.devicesshop;


import java.time.LocalDate;

public interface ShopAssistant {
    /**
     *
     * @return the created Customer's instance  or null if there hasn't been a customer created.
     */
    public Customer createCustomer();
    public void updateCustomer();
    public Customer getCustomer(int id);
    public Product createProduct();
    public void updateProduct();
    public Product getProduct(int id);
    public Purchase createPurchase();
    public void showCustomerInfo(int id);
    public void showProductInfo(int id);
    public void showPurchaseId(int id);
    public void showCustomersList();
    public void showProductsList();
    public void showPurchasesList();

}
