package orders;

import inventory.Product;
import inventory.OutOfStockException;

public class Order extends Thread {
    public   Product product;
    public  int required;

    public Order(Product product, int required) {
        this.product = product; // constructor 
        this.required = required;
    }

    @Override
    public void run() {
        try {
            product.reduceStock(required);    
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}
