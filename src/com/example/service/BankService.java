package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class BankService {
    public void withdraw(int amount) {
        System.out.println("Withdrawn Amount: " + amount);
    }

    public int deposit(int amount) {
        System.out.println("Deposited Amount: " + amount);
        return amount;
    }

    public void checkBalance() {
        System.out.println("Checking account balance...");
    }

    public void throwException() {
        throw new RuntimeException("Bank error occurred!");
    }
}
