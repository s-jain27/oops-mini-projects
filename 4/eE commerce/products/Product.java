package products;

public class Product {
    public int Id;
    public int stock;
    // Constructor 
    public Product(int Id, int stock) {
        this.Id = Id;
        this.stock = stock;
    }
    // Method to decrease stock when an order is placed
    public synchronized void updatestock(int required) throws ProductUnavailableException {
       if(stock > required){stock -= required;}
       else {
            throw new ProductUnavailableException("Product ID " + Id + " is out of stock");
        }
        
    }
}
