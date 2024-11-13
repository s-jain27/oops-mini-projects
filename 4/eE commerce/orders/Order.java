package orders;

import products.Product;
import products.ProductUnavailableException;
import payments.PaymentProcessor;
import payments.PaymentFailureException;

public class Order extends Thread{
    public  Product prod;
    public  int quantity ;

    // Constructor 
    public Order(Product abcd, int quantity) {
        this.prod = abcd;
        this.quantity = quantity;
    }
    // Run method to process the order 
    @Override
    public void run() {
        try {
            prod.updatestock(quantity); //update stock calling 
            PaymentProcessor.processPayment(); // Attempt payment
            System.out.println("Ordered successfully.");
        } catch (ProductUnavailableException e) {
            System.out.println( e.getMessage());
        } catch (PaymentFailureException e) {
            System.out.println( e.getMessage());
        } finally {
            System.out.println("thanks");
        }
    }
}
