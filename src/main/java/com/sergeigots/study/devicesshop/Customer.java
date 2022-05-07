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
        System.out.println("Customer info:");
        System.out.println("Full name: " + surname + ' ' + name + ' ' + patronymic );
        System.out.println("Date of birth: " + dateOfBirth.toString());
        System.out.println();
    }
}
