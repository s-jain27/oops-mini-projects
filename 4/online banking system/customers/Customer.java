package customers;
import accounts.BankAccount;// importing package calss

public class Customer {
    public String name;
    public BankAccount account; 
// customer constructor 
    public Customer( String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }
}
