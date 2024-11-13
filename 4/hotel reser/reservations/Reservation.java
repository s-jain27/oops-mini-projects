package reservations;

import rooms.Room;
import rooms.OverbookingException;
import payments.Payment;
import payments.InvalidPaymentException;
public class Reservation extends Thread {
    private Room room;

    public Reservation(Room room) {
        this.room = room;
    }

    @Override
    public void run() {
        try {
            if (room.bookRoom()==true) {
                Payment.processPayment();
                System.out.println("Room " + room.roomNumber + " booked successfully.");
                // Simulate reservation process.
              
            }
        } catch (OverbookingException e) {
            System.out.println(e.getMessage());
        }
        catch(InvalidPaymentException e){
            System.out.println(e.getMessage());
          }
          finally{
            System.out.println("thanks");
          }
    }

    
}
