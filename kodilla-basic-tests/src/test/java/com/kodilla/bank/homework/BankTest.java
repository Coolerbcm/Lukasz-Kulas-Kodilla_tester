package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    private Bank bank;

    @Test           //Testowanie dodawania transakcji do istniejacych bankomatów.
    public void testAddTransactionToCashMachine() {
        bank = new Bank(3);
        bank.addTransaction(0, 100);
        bank.addTransaction(1, -50);
        bank.addTransaction(2, 50);

        assertEquals(100, bank.getTotalBalance());
        assertEquals(2, bank.getTotalDeposits());
        assertEquals(1, bank.getTotalWithdrawals());
        assertEquals(75.0, bank.getAverageDeposit());
        assertEquals(-50.0, bank.getAverageWithdrawal());
    }

    @Test           //Testowanei dodawania transakcji do nieistniejacych bankomatów.
    public void testAddTransactionToInvalidCashMachineIndex() {
        bank = new Bank(3);
        bank.addTransaction(7, 1000);

        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getTotalDeposits());
        assertEquals(0, bank.getTotalWithdrawals());
        assertEquals(0.0, bank.getAverageDeposit());
        assertEquals(0.0, bank.getAverageWithdrawal());
    }

    @Test           //Testowanie zwracania calkowitego bilansuw  bankomatach.
    public void testGetTotalBalance() {
        bank = new Bank(3);
        bank.addTransaction(0, 100);
        bank.addTransaction(1, -50);
        bank.addTransaction(2, 50);

        assertEquals(100, bank.getTotalBalance());
    }

    @Test           //Testowanie zliczenia liczby wypłat z bankomatów.
    public void testGetTotalWithdrawals() {
        bank = new Bank(3);
        bank.addTransaction(0, 300);
        bank.addTransaction(1, -50);
        bank.addTransaction(2, -50);

        assertEquals(2, bank.getTotalWithdrawals());
    }

    @Test           //Testowanie zliczenia liczby wpłat do bankomatów.
    public void testGetTotalDeposits() {
        bank = new Bank(3);
        bank.addTransaction(0, 500);
        bank.addTransaction(1, 75);
        bank.addTransaction(1, 125);

        assertEquals(3, bank.getTotalDeposits());
    }

    @Test           // Testowanie wyliczenia średniej wypłat z bankomatów.
    public void testGetAverageWithdrawal() {
        bank = new Bank(3);
        bank.addTransaction(0, -50);
        bank.addTransaction(1, -100);
        bank.addTransaction(2, -450);

        assertEquals(-200, bank.getAverageWithdrawal());
    }

    @Test           //Testowanie wyliczenia średniej wypłat z bankomatów przy braku jakichkolwiek wypłat.
    public void testGetAverageWithdrawalNoWithdrawals() {
        bank = new Bank(3);
        bank.addTransaction(0, 100);
        bank.addTransaction(1, 200);
        bank.addTransaction(2, 200);

        assertEquals(0.0, bank.getAverageWithdrawal());
    }

    @Test           //Testowanie wyliczenia średniej wpłat do bankomatów.
    public void testGetAverageDeposit() {
        bank = new Bank(3);
        bank.addTransaction(0, 300);
        bank.addTransaction(1, 150);
        bank.addTransaction(2, 150);

        assertEquals(200, bank.getAverageDeposit());
    }

    @Test           ////Testowanie wyliczenia średniej wpłat do bankomatów przy braku jakichkolwiek wpłat.
    public void testGetAverageDepositNoDeposits() {
        bank = new Bank(3);
        bank.addTransaction(0, -50);
        bank.addTransaction(1, -100);
        bank.addTransaction(2, -250);

        assertEquals(0.0, bank.getAverageDeposit());
    }
}