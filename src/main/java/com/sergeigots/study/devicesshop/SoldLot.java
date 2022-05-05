package com.sergeigots.study.devicesshop;

public class SoldLot {
    protected int productArticle;
    protected double sellPrice;
    protected int itemsCount;

    /**
     *
     * @param product - product is being currently sold.
     * @param itemsCount - number of items of the sold product
     */
    public SoldLot(Product product, int itemsCount){
        this.productArticle = product.getArticle();
        this.sellPrice = product.getCurrentPrice();
        this.itemsCount = itemsCount;
    }

    public int getProductArticle() {
        return productArticle;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
