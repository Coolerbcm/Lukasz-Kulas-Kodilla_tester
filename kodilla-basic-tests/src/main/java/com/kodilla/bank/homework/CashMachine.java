package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }
    public void addTransaction(int transaction) {
        this.size++;
        int[] newTransaction = new int[size];
        System.arraycopy(transactions, 0, newTransaction, 0, transactions.length);
        newTransaction[size - 1] = transaction;
        this.transactions = newTransaction;
    }
    public int getBalance() {
        int balance = 0;
        for (int transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }
    public int[] getTransactions() {
        return transactions;
    }
}