package suppliers;
import inventory.Product;
public class Supplier extends Thread {
    public String suppliername;
    public  Product product ;
    public  int quantity ;
    public Supplier(String name ,Product product, int quantity) { // constructor
        this.suppliername = name;
        this.product=product;
        this.quantity = quantity;
    }
   
@Override
    public void run() {
        try {
            System.out.println();
            product.addstock(quantity);
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }   
}
