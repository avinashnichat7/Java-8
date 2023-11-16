package oops.exceptions;

public class Account extends Object{
    private int balance=2000;

    public int balance() {
        return balance;
    }

    public void withDrowAmount(int amount) {
        if (balance < amount) {
            throw new CutomeException("insufficient balance");
        }
        balance = balance - amount;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.withDrowAmount(5000);
    }
}
