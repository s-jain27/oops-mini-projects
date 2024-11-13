package inventory;

public class Product {
    public String prodname;
    public int stock;

    public Product(String prodname, int stock) {
        this.prodname = prodname;
        this.stock = stock;
    }
    public synchronized void addstock(int quantity) {
        stock += quantity;
        System.out.println("Stock added by supplier. New stock: " + stock);
    }
    public synchronized void reduceStock(int required) throws OutOfStockException {
       if(stock > required){
         stock -= required;
        System.out.println("Order placed  . Remaining stock: " + stock);
    }
    else{
        throw new OutOfStockException("Insufficient stock for Product ID: " + prodname);
        }
}
}

