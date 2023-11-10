package homework.withdraw;

public class Wallet {
    private int balance = 100;

    public int getWalletBalance(){
        return balance;
    }
    public void debit(int money) {
        this.balance -= money;
    }
    public void withdraw(int amount){
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }
}
