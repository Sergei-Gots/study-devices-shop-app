package com.sergeigots.study.devicesshop;

import java.awt.Color;
import java.time.LocalDate;

public class Product {
    protected static int nextProductId;
    protected int id;
    protected String manufacturer;
    protected String name;
    protected String article;
    protected Color color;
    protected LocalDate manufactureDate;
    double currentPrice;

    public Product(String manufacturer, String name, String article, Color color,
                   LocalDate manufactureDate, double currentPrice){
        this.id = nextProductId++;
        this.manufacturer = manufacturer;
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.currentPrice = currentPrice;

    }

    public int getId() {
        return id;
    }

    public String getArticle() {
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
