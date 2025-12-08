package com.devtalles.exception.personalizadas.unchecked;

public class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new NegativeBalanceException("Fondos insuficientes...");
        }
    }
}
