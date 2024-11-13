package payments;
//  exception for payment failure 
public class PaymentFailureException extends Exception {
    // Constructor to set message and error code for failure
    public PaymentFailureException(String msg) {
        super(msg); 
    }
}

