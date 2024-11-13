package accounts;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);// parent calss calling by super
    }
}
