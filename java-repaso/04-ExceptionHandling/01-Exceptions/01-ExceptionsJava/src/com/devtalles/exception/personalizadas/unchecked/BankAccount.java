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
        balance -= amount;
        System.out.println("Retiro exitoso");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = null;
        try {
            account = new BankAccount(500);
            account.withdraw(600);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo: " + account.getBalance());
    }

}
