package payments;

public class InvalidPaymentException extends Exception {
    public InvalidPaymentException(String message) {
        super(message);
    }
}

