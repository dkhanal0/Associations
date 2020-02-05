package associations;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //Instatiate objects to test your code
        ArrayList<OrderItem> items = new ArrayList<>();
        Customer c1 = new Customer("khanal", "Durga", "149 huntley street", "13208");
        Account a1 = new Account("12334", c1);
        Product p1 = new Product("Shampoo", "123-23-345", 3.5);
        OrderItem oi1 = new OrderItem(p1, 3);


        System.out.println("Address:" + c1.getStreetAddress() + " " + a1.getAccountNumber());



    }
    }

