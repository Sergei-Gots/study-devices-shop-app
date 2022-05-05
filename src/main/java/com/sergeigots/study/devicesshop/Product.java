package com.sergeigots.study.devicesshop;

import java.awt.Color;
import java.time.LocalDate;

public class Product {
    protected static int nextShopProductArticle;
    protected int article;
    protected String manufacturer;
    protected String name;
    protected Color color;
    protected LocalDate manufactureDate;
    double currentPrice;

    public Product(String manufacturer, String name, Color color,
                   LocalDate manufactureDate, double currentPrice){
        this.article = nextShopProductArticle++;
        this.manufacturer = manufacturer;
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.currentPrice = currentPrice;

    }

    public int getArticle() {
        return article;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}
