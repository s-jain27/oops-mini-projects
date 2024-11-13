package inventorysystem ;
import orders.Order;
import suppliers.Supplier;
import inventory.Product;
public class InventorySystem {
    public static void main(String[] args) {
        Product p1 = new Product("paracetamol", 100); // product obj constructor call
        // Creating threads
        Order t1 = new Order(p1, 50);
        Supplier t2 = new Supplier("Jain pharma",p1, 30);

        // Start threads
        t1.start();
        t2.start();

        DailyAudits t3 = new DailyAudits();
        t3.setDaemon(true); // daemon thread for background
        t3.start();
    }
}
