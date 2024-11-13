package hotelreservation;
import rooms.Room;
import reservations.Reservation;


public class HotelReservationSystem {
    public static void main(String[] args) {
        Room room1 = new Room(1065);// room constructor call

        Room room2 = new Room(1023);

        //  Reservation threads for each room (extend Thread)
        Reservation reservation1 = new Reservation(room1);
        reservation1.start();
        Reservation reservation2 = new Reservation(room1);
        reservation2.start();
        Reservation reservation3 = new Reservation(room2);
        reservation3.start();
      room2.cancelRoom();
    }
}
