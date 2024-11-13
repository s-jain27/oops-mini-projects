package payments;

public class Payment {
    public static  void processPayment() throws InvalidPaymentException {
        boolean flag = true;// 
        if (flag==false) {
            throw new InvalidPaymentException("Transaction error ");
        }
        System.out.println("Payment done ");
    }
}

