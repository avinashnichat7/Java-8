package practice.oct_30.exceptions;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Account {
    private static int balance = 500;

    public static void withdrowAmout(int amount) {
        if (amount > balance) {
            throw new InsufficentBalanceInAccount("insufficent Fund in Account");
        }
        balance = balance - amount;
    }

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Current balance = " + account.getBalance());

        Account.withdrowAmout(6000);

        System.out.println("Current balance = " + account.getBalance());
        
    }

    public int getBalance() {
        return balance;
    }
}
