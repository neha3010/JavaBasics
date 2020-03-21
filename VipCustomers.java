package com.company;

import javax.security.auth.login.AccountException;

public class VipCustomers {
    private String name;
    private double creditLimit;
    private String email;


    public VipCustomers(String name, String email, double creditLimit){
        System.out.println("First constructor");
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomers(String name, String email){
        this(name, email, 30000.0);
    }

    public VipCustomers(){
        this("Neha","email@email.com", 30000.0);
    }




    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }




}
