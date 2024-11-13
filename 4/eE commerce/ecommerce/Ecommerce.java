package ecommerce;

import products.Product;
import orders.Order;

public class Ecommerce {
    public static void main(String[] args) {
        Product p1 = new Product(6434, 52); 
        // Start multiple order threads
        for (int i = 0; i < 4; i++) {
          Order order = new Order(p1,3);
          order.start();
       
        } 
        // Create and start the MaintenanceThread
        Maintenance mt = new Maintenance();
        mt.setDaemon(true); // Set the thread as daemon
        mt.start(); 
    }
}

