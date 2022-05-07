package com.sergeigots.study.devicesshop;


public interface ShopAssistant {
    public void createCustomer();
    public void updateCustomer();
    public Customer getCustomer(int id);
    public void createProduct();
    public void updateProduct();
    public Product getProduct(int id);
    public void createPurchase();
    public void showCustomerInfo(int id);
    public void showProductInfo(int id);
    public void showPurchaseId(int id);
    public void showCustomersList();
    public void showProductsList();
    public void showPurchasesList();

}
