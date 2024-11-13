package payment;
import rides.Ride;
import rides.NoDriverAvailableException ;

public class Payment extends Thread{
    public int amount;
    public Ride ride;

public Payment(int amount ,Ride ride){ // constructor 
    this.amount = amount;
    this.ride= ride;
}
public boolean paymentstatus(){ // method for payment status
     if(amount > 0){return true;}
     return false ;
}
@Override
public void run() {
    try {  // run metohd
        if(paymentstatus()){ ride.assignDriver();
                System.out.println("payment of "+amount+" done by "+ride.client.name+" for ride "+ride.rideId);      
        }        
        }
     catch (NoDriverAvailableException e) {
        System.out.println(e.getMessage());
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
