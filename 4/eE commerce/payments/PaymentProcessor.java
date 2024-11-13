package payments;

public class PaymentProcessor {
    public static void processPayment() throws PaymentFailureException {
        boolean flag = true;// 
        if (flag==false) {
            throw new PaymentFailureException("Transaction error ");
        }
        System.out.println("Payment done ");
    }
}
