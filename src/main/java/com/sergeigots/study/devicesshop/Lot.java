package com.sergeigots.study.devicesshop;

public class Lot {
    protected int productId;
    protected double salePrice;
    protected int itemsCount;

    protected double sum;

    public static Lot of(Product product, int itemsCount){
        return new Lot(product, itemsCount);
    }
    /**
     *
     * @param product - a product to be currently sold.
     * @param itemsCount - number of items of the sold product
     */
    public Lot(Product product, int itemsCount) {
        this.productId = product.getId();
        this.salePrice = product.getCurrentPrice();
        this.itemsCount = itemsCount;
        this.sum = salePrice * itemsCount;
    }

    public int getProductId() {
        return productId;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public String toString(){
        return "Product: " + ShopApp.getShop().getProduct(productId)
                + "Sale price: " + salePrice
                + ", items count: " + itemsCount
                + ". Sum = " + sum + ". ";
    }

    public double getSum() {
        return sum;
    }
}
