package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomers customer1 = new VipCustomers("Roopa","email345@email.com",34009.0 );
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());


        VipCustomers customer2 = new VipCustomers("Venu", "email22@email.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());



        VipCustomers customer3 = new VipCustomers();
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());




    }
}
