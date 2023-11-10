package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }
    public void withdraw(Wallet wallet, int amount){
        if(wallet.getBalance() >= amount){
            wallet.withdraw(amount);
            cashSlot.dispense(amount);
        } else {
            System.out.println("Insuficient funds. Withdrawal unsuccessful");
        }
    }
}