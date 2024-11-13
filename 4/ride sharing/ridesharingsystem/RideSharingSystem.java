package ridesharingsystem;
import users.Client ;
import users.Driver;
import payment.Payment;
import rides.Ride;

public class RideSharingSystem {
    public static void main(String[] args) {
        Client c1 = new Client("shaurya");
        Driver d1 = new Driver("Newton kumar ") ;
        Client c2 = new Client("Trump");
        Driver d2 = new Driver("Biden ") ;
        
        Ride r1 = new Ride(1776,c1 ,d1 ) ;
        Payment t1 = new Payment(450,r1);
        t1.start();
        Ride r2 = new Ride(1796,c2 ,d2 ) ;
        Payment t2 = new Payment(450,r2);   
        t2.start();
    }
}
