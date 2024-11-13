package rides;
import users.Client;
import users.Driver; // iumporting packages 
 
public class Ride {
    public int rideId;
    public Client client;
    public  Driver driver;
    public boolean isAvailable;

  public Ride(int rideId ,Client client,Driver driver){
    this.rideId =rideId ;  // constructor
     this.client=client;
     this.isAvailable=true;
     this.driver = driver;
  }
  // method to assign drivers  and exception hand
  public synchronized void assignDriver() throws NoDriverAvailableException {
    if (isAvailable==true) {
    isAvailable = false;
    System.out.println("Driver "+driver.name+" assigned to ride ID: " + rideId);
    }
    else{    
         throw new NoDriverAvailableException("No drivers available for ride ID: " + rideId);
        }
}
public synchronized void completeRide() { // when ride is completed
    this.isAvailable = true;
}
}
