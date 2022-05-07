package com.sergeigots.study.devicesshop;

public class Lot {
    protected int productId;
    protected double sellPrice;
    protected int itemsCount;

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
        this.sellPrice = product.getCurrentPrice();
        this.itemsCount = itemsCount;
    }

    public int getProductId() {
        return productId;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
