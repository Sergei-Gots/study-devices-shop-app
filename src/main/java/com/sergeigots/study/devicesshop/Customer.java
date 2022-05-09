package com.sergeigots.study.devicesshop;

import java.time.LocalDate;
import java.time.Month;

public class Customer implements ShopDataEntity {
    static protected int customerCount;

    protected int id;

    protected String surname;
    protected String name;
    protected String patronymic;

    protected LocalDate dateOfBirth;
    protected boolean isBirhdaySpecified;

    public static Customer getCustomer(int id){
        return ShopApp.getShop().getCustomer(id);
    }

    Customer(String surname, String name, String patronymic, LocalDate dateOfBirth){
        id = customerCount++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.isBirhdaySpecified = true;
    }

    Customer(String surname, String name, String patronymic, int yearOfBirth){
        id = customerCount++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = LocalDate.of(yearOfBirth, Month.JANUARY, 1);
        this.isBirhdaySpecified = false;
    }

    public static int getCustomerCount() {
        return customerCount;
    }



    public int getId(){
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isBirhdaySpecified(){
        return isBirhdaySpecified;
    }

    @Override
    public void printInfo() {
        System.out.println("Customer: " + this);
    }

    public String toString(){
        return surname + ' ' + name + ' ' + patronymic
                + ", Date of birth: " + dateOfBirth.toString() + ". ";
    }
}
