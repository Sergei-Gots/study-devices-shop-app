package com.sergeigots.study.devicesshop;

import java.awt.Color;
import java.lang.reflect.Field;
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

    public static int getProductsCount(){
        return nextProductId;
    }

    public static Product getProduct(int id){
        return ShopApp.getShop().getProduct(id);
    }

    public Product(String manufacturer, String name, String article,
                   String colorName,
                   LocalDate manufactureDate, double currentPrice){
        this.id = nextProductId++;
        this.manufacturer = manufacturer;
        this.name = name;
        this.article = article;

        try {
            Field field = Color.class.getField(colorName);
            this.color = (Color)field.get(null);
        } catch (Exception e) {
            System.out.println("Adding a new product: the color \"" + colorName
                    + "\" is not listed in the standard color table\n");
        }
        if(this.color!=null) {
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
        System.out.println("Product: " + this);
    }

    public String toString() {
        return  name  + ' ' + article
                + " (color: " + colorName
                + ") manufactured by " + manufacturer
                + " " + manufactureDate.toString()
                + ", current price: " + currentPrice + ". ";
    }
}

