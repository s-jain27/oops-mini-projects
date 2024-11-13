package banking;

import accounts.BankAccount;
import transactions.Transaction;
import customers.Customer;

public class OnlineBankingSystem {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(2203, 5678); // bank account objects constructor call
        BankAccount a2 = new BankAccount(2706, 3998);

        Customer c1 = new Customer( "shaurya", a1);
        Customer c2 = new Customer( "trump", a2);// customer objects
     // thread objects
        Transaction t1 = new Transaction(a2, a1, 2000, "transfer");
        Transaction t2 = new Transaction(a2, null, 10000, "deposit");

        t1.setPriority(Thread.MAX_PRIORITY); // priority set
        t1.start(); // 1st yherad start

        try{
            t1.join(); // kind of interthread communication
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        t2.start();// 2nd thread satrt
// final details print 
        System.out.println("Final balance of "+c1.name+" is : "+a1.balance);
        System.out.println("Final balance of "+c2.name+" is : "+a2.balance);
    }
}

