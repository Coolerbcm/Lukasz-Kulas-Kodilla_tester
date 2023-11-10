package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet(){

    }
    public void deposit(int money){
        this.balance += money;

    }
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }
}
