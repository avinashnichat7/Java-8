package practice.oct_30.exceptions;

public class InsufficentBalanceInAccount extends RuntimeException {

    private String message;

    public InsufficentBalanceInAccount(String message) {
        super(message);
    }
}

