package com.sergeigots.study.devicesshop;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Shop implements ShopAssistant {

    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList<Product> products = new ArrayList<>();
    private final ArrayList<Purchase> purchases = new ArrayList<>();

    public Shop(){
        loadShopImaginedHistory();
    }

    private void loadShopImaginedHistory(){
        customers.add(new Customer("van Rijn", "Rembrandt", "Harmenszoon",
                LocalDate.of(1606, Month.JULY, 15)));
        customers.add(new Customer("Rubens", "Peter", "Paul",
                LocalDate.of(1577, Month.JUNE, 28)));
        customers.add(new Customer("Vermeer", "", "Johannes",
                LocalDate.of(1632, Month.OCTOBER, 31)));
        customers.add(new Customer("Steen", "Jan", "",
                1626));
        customers.add(new Customer("Brueghel", "Pieter", "the Elder",
                1525));
        customers.add(new Customer("Brueghel", "Jan", "the Elder",
                1568));
        customers.add(new Customer("Heda", "Willem", "Claesz.",
                LocalDate.of(1593, Month.DECEMBER, 14)));
        customers.add(new Customer("Heda", "Willem", "Claesz.",
                LocalDate.of(1593, Month.DECEMBER, 14)));


        products.add(new Product("Apple", "IPhone", "Pro 13",
                "DARK_GRAY",
                LocalDate.of(2022,Month.MAY,7),
                1159.00));
        products.add(new Product("Apple", "IPhone", "13",
                "WHITE",
                LocalDate.of(2022,Month.MAY,7),
                909.00));
        products.add(new Product("Apple", "IPhone", "mini",
                "BLACK",
                LocalDate.of(2022,Month.MAY,7),
                809.00));
        products.add(new Product("Apple", "IPhone", "SE",
                 "DARK_GRAY",
                LocalDate.of(2022,Month.MAY,7),
                529.00));
        products.add(new Product("Apple", "IPhone", "SE",
                 "WHITE",
                LocalDate.of(2022,Month.MAY,7),
                529.00));
        products.add(new Product("Apple", "IPhone", "SE",
                 "RED",
                LocalDate.of(2022,Month.MAY,7),
                529.00));
        products.add(new Product("Apple", "IPad", "Air",
                 "DARK_GRAY",
                LocalDate.of(2022,Month.MAY,7),
                698.50));

        ArrayList <Lot> purchase1 = new ArrayList<>();
        purchase1.add(Lot.of(getProduct(0), 1));

        ArrayList <Lot> purchase2 = new ArrayList<>();
        purchase1.add(Lot.of(getProduct(4), 2));
        purchase1.add(Lot.of(getProduct(5), 3));
        purchase1.add(Lot.of(getProduct(6), 1));

        ArrayList <Lot> purchase3 = new ArrayList<>();
        purchase1.add(Lot.of(getProduct(3), 2));

        purchases.add(
                new Purchase(LocalDateTime.of(2022, Month.MAY, 7, 17, 5),
                        0, purchase1));
        purchases.add(
                new Purchase(LocalDateTime.of(2022, Month.MAY, 7, 17, 5),
                        1, purchase2));
        purchases.add(
                new Purchase(LocalDateTime.of(2022, Month.MAY, 7, 17, 5),
                        2, purchase3));
    }


    public Customer createCustomer(){
        String name, surname, patronymic;
        LocalDate dateOfBirth;
        System.out.println("Create a new customer");

        try {
            System.out.print("Input the name: ");
            name = ShopApp.bufferedReader.readLine();
            System.out.print("Input the patronymic: ");
            patronymic = ShopApp.bufferedReader.readLine();
            System.out.print("Input the surname: ");
            surname = ShopApp.bufferedReader.readLine();

            try {
                System.out.print("Input the birthdate ('YYYY-MM-DD'): ");
                dateOfBirth = LocalDate.parse(ShopApp.bufferedReader.readLine());
            }
            catch(Exception e) {
                System.out.println("There is an exception caught during reading and parsing date of birth. " +
                        "Next time be careful with an input, please\n");
                return null;
            }
        }
        catch (java.io.IOException e) {
            System.out.println("There is something wrong with the input: " + e + '\n');
            return null;
        }

        Customer customer = new Customer(surname, name, patronymic, dateOfBirth);
        customers.add(customer);
        System.out.println("A new customer has been successfully added.\n");
        return customer;
    }

    public Purchase createPurchase(){
        int customerId;
        LocalDateTime saleDateTime = LocalDateTime.now();
        ArrayList<Lot> lots = new ArrayList<>();

        System.out.println("Create a new purchase");
        System.out.println("Sale time = " + saleDateTime);

        try {
            boolean carryOn = true;
            int productIdMax = Product.getProductsCount()-1;
            System.out.print("Input a customer ID (from 0 to "
                    + (Customer.getCustomerCount()-1) + "): ");
            customerId = Integer.parseInt(ShopApp.bufferedReader.readLine());
            System.out.println("Input sold lots. ");
            while(carryOn) {
                int productId=-1, itemsCount;
                Product product;
                System.out.print("Input a product ID (from 0 to "
                        + productIdMax + ") or '-1' to close the list: ");
                productId = Integer.parseInt(ShopApp.bufferedReader.readLine());
                if(productId==-1){
                    carryOn = false;
                    continue;
                }
                else if(productId>productIdMax) {
                    System.out.println("Input product Id is not listed. Please try to input another id once again...");
                    continue;
                }

                System.out.print("\tSelected product: ");
                product = products.get(productId);
                product.printInfo();
                System.out.print("\tInput an items count: ");
                itemsCount = Integer.parseInt(ShopApp.bufferedReader.readLine());
                lots.add(new Lot(product, itemsCount));
            }
        }
        catch (java.io.IOException e) {
            System.out.println("There is something wrong with the input: " + e + '\n');
            return null;
        }

        Purchase purchase = new Purchase(saleDateTime, customerId, lots);
        purchases.add(purchase);
        System.out.println("A new purchase has been successfully dealt and added to the list.\n");
        return purchase;
    }

    public void updateCustomer(){

    }

    public Customer getCustomer(int id){

        return customers.get(id);
    }

    public Purchase getPurchase(int id){
        return purchases.get(id);
    }

    public Product createProduct(){
            String manufacturer, name, article, colorName;
            LocalDate manufactureDate;
            double currentPrice;
            System.out.println("Add a new product");

            try {
                System.out.print("Input the manufacturer: ");
                manufacturer = ShopApp.bufferedReader.readLine();
                System.out.print("Input the product name: ");
                name = ShopApp.bufferedReader.readLine();
                System.out.print("Input the product's article: ");
                article = ShopApp.bufferedReader.readLine();

                System.out.print("Input the color (text value): ");
                colorName = ShopApp.bufferedReader.readLine();

                try {
                    System.out.print("Input the manufacture date ('YYYY-MM-DD'): ");
                    manufactureDate = LocalDate.parse(ShopApp.bufferedReader.readLine());
                }
                catch(Exception e) {
                    System.out.println("There is an exception caught during reading and parsing date of manufacturing." +
                            "Next time be careful with an input, please\n");
                    return null;
                }

                System.out.print("Input the current price: ");
                currentPrice = Double.parseDouble(ShopApp.bufferedReader.readLine());
            }
            catch (java.io.IOException e) {
                System.out.println("You've entered something wrong: " + e + '\n');
                return null;
            }

            Product product = new Product(manufacturer, name, article,
                    colorName, manufactureDate, currentPrice);
            products.add(product);
            System.out.println("A new product has been successfully added.\n");
            return product;
        }

    public void updateProduct(){

    }

    public Product getProduct(int id){

        return products.get(id);
    }

    public void showCustomerInfo(int customerId){

    }

    public void showProductInfo(int productId){

    }

    public void showPurchaseId(int purchaseId){

    }

    public void showCustomersList(){

    }

    public void showProductsList(){

    }

    public void showPurchasesList(){

    }
}
