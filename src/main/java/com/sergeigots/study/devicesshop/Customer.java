package com.sergeigots.study.devicesshop;

import java.time.LocalDate;

public class Customer {
    static protected int customerCount;

    protected int id;

    protected String surname;
    protected String name;
    protected String patronymic;

    LocalDate dateOfBirth;

    Customer(String surname, String name, String patronymic, LocalDate dateOfBirth){
        id = customerCount++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
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

}
