package com.example.banking;

import jakarta.persistence.*;

@Entity
@Table(name="accounts")
public class Account {
    @Id
    private int accNo;
    private String name;
    private double balance;

    // getters and setters
    public int getAccNo() { return accNo; }
    public void setAccNo(int accNo) { this.accNo = accNo; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
