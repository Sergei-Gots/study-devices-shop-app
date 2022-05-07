package com.sergeigots.study.devicesshop;

import java.awt.Color;
import java.time.LocalDate;

public class Product implements ShopDataEntity{
    protected static int nextProductId;
    protected int id;
    protected String manufacturer;
    protected String name;
    protected String article;
    protected Color color;
    protected String colorName;
    protected LocalDate manufactureDate;
    double currentPrice;

    public Product(String manufacturer, String name, String article,
                   Color color, String colorName,
                   LocalDate manufactureDate, double currentPrice){
        this.id = nextProductId++;
        this.manufacturer = manufacturer;
        this.name = name;
        this.article = article;
        this.color = color;
        if(color!=null) {
            this.colorName = colorName;
        }
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
    @Override
    public void printInfo() {
        System.out.println("Product info:");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model name: " + name + ' ' + article);
        System.out.println("Color: " + colorName);
        System.out.println("Manufacture date: " + manufactureDate.toString());
        System.out.println("Current price: " + currentPrice);
        System.out.println();
    }
}

