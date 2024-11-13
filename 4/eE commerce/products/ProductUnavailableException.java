package products;
//  exception for out-of-stock 
public class ProductUnavailableException extends Exception {
    public ProductUnavailableException(String msg) {
        super(msg); // parent class constructor call
    }
}
