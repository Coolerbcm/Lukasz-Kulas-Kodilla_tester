package com.kodilla.bank.homework;

public class Bank {
    private final CashMachine[] cashMachines;

    public Bank(int numberOfCashMachines) {
        this.cashMachines = new CashMachine[numberOfCashMachines];
        for (int i = 0; i < numberOfCashMachines; i++) {
            cashMachines[i] = new CashMachine();
        }
    }

    public void addTransaction(int cashMachineIndex, int transaction) {
        if (cashMachineIndex >= 0 && cashMachineIndex < cashMachines.length) {
            cashMachines[cashMachineIndex].addTransaction(transaction);
        }
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalWithdrawals() {
        int totalWithdrawals = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalWithdrawals += getWithdrawalsCount(cashMachine);
        }
        return totalWithdrawals;
    }

    public int getTotalDeposits() {
        int totalDeposits = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalDeposits += getDepositsCount(cashMachine);
        }
        return totalDeposits;
    }

    public double getAverageWithdrawal() {
        int totalWithdrawals = 0;
        int withdrawalsCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalWithdrawals += getWithdrawalsTotalAmount(cashMachine);
            withdrawalsCount += getWithdrawalsCount(cashMachine);
        }
        if (withdrawalsCount == 0) {
            return 0;
        }
        return (double) totalWithdrawals / withdrawalsCount;
    }

    public double getAverageDeposit() {
        int totalDeposits = 0;
        int depositsCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalDeposits += getDepositsTotalAmount(cashMachine);
            depositsCount += getDepositsCount(cashMachine);
        }
        if (depositsCount == 0) {
            return 0;
        }
        return (double) totalDeposits / depositsCount;
    }
    private int getWithdrawalsCount(CashMachine cashMachine) {
        int count = 0;
        for (int transaction : cashMachine.getTransactions()) {
            if (transaction < 0) {
                count++;
            }
        }
        return count;
    }
    private int getDepositsCount(CashMachine cashMachine) {
        int count = 0;
        for (int transaction : cashMachine.getTransactions()) {
            if (transaction > 0) {
                count++;
            }
        }
        return count;
    }
    private int getWithdrawalsTotalAmount(CashMachine cashMachine) {
        int total = 0;
        for (int transaction : cashMachine.getTransactions()) {
            if (transaction < 0) {
                total += transaction;
            }
        }
        return total;
    }

    private int getDepositsTotalAmount(CashMachine cashMachine) {
        int total = 0;
        for (int transaction : cashMachine.getTransactions()) {
            if (transaction > 0) {
                total += transaction;
            }
        }
        return total;
    }
}