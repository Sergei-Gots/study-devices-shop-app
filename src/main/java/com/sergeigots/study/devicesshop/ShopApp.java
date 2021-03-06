package com.sergeigots.study.devicesshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class ShopApp  {
    static final Shop shop = new Shop();
    static BufferedReader bufferedReader
            = new BufferedReader(new InputStreamReader(System.in));

    static {
        System.out.println("\nHello World!\n" +
                "Welcome to our new Devices Shop!:)\n");
    }

    public static Shop getShop() {
        return shop;
    }
    public static void main( String[] args ) throws IOException
    {
        ShopAssistant shopAssistant = shop;
        ShopDataEntity entity;

        String input;
        char ch = 'H';
        boolean carryOn=true;

        while(carryOn){
            switch(ch){
                case 'H':
                    System.out.println("Type 'Key' on a keyboard and then press 'Enter'. 'Key' can be:");
                    System.out.println("U - to print the cUstomers list;");
                    System.out.println("R - to print the pRoducts list;");
                    System.out.println("A - to print the purchAses list;");
                    System.out.println("C - to add a new Customer;");
                    System.out.println("P - to add a new Product;");
                    System.out.println("S - to add a new purchaSe;");
                    System.out.println("X - to eXit the application;");
                    System.out.println("H - outputs this information again\n");
                    break;
                case 'U':
                    shopAssistant.printCustomers();
                    break;
                case 'R':
                    shopAssistant.printProducts();
                    break;
                case 'A':
                    shopAssistant.printPurchases();
                    break;
                case 'C':
                    entity = shopAssistant.createCustomer();
                    if(entity != null) {
                        entity.printInfo();
                    }
                    break;
                case 'P':
                    entity = shopAssistant.createProduct();
                    if(entity != null) {
                        entity.printInfo();
                    }
                    break;
                case 'S':
                    entity = shopAssistant.createPurchase();
                    if(entity != null) {
                        entity.printInfo();
                    }
                    break;
                case 'X':
                    System.out.println("Thank you for volunteering in our shop. See you again.");
                    carryOn = false;
                    continue;
                default:
                    System.out.println("You've entered: '" + ch + "'");
                    ch = 'H';
                    continue;
            }
            System.out.print("Type here your next char-command, please: ");
            input = bufferedReader.readLine();
            ch = input.toUpperCase().charAt(0);
        }
        bufferedReader.close();
    }

}
