package exceptions.customException;

//suppose we an Bank account we haev 5000 rs
//but wr are trying to overdrow amt that is 6000rs so we will get exception here
public class Account {
    int balance = 5000;

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("current acoount balance = " + account.balance());
        account.withdraw(6000);

        System.out.println("current acoount balance = " + account.balance());
    }

    public int balance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > balance) {

            throw new InsufficientFund("invalid balance in account");
        }
    }

}
