package homework.withdraw;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }
    public void withdrawMoney(Wallet wallet, int amount){
        if(wallet.getWalletBalance() >= amount){
            wallet.withdraw(amount);
            cashSlot.dispense(amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful");
        }
    }
}