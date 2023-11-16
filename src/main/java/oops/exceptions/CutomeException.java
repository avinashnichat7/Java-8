package oops.exceptions;

public class CutomeException extends RuntimeException {
    private String message;

    public CutomeException(String message) {
        super(message);
    }
}
