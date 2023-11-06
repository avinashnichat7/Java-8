package exceptions.customException;

public class InsufficientFund extends RuntimeException {

    private String message;

    public InsufficientFund(String message) {
        super(message);
    }
}
