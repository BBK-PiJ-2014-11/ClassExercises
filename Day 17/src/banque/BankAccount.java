package Banque;

/**
 * Created by Ehshan on 09/02/2015.
 */
public class BankAccount {

    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public static void main(String args[]) {
        BankAccount account = new BankAccount();
        for (int i = 0; i < 100; i++) {
            System.out.println("Balance is "+account.getBalance());
            //account.deposit(100);
            account.retrieve(50);
            account.deposit(100);
            System.out.println("Balance is "+account.getBalance());
        }
    }

    public synchronized int deposit(int money) {
        balance = balance + money;
        return balance;
    }

    public synchronized int retrieve(int money) {
        int result = 0;
        if (balance > money) {
            result = money;
        } else {
            result = balance;
        }
        balance = balance - result;
        return result;
    }

}