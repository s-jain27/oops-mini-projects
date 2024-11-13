package rooms;

public class Room {
    public int roomNumber;
    public boolean isAvailable;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;  // Initially all rooms are available
    }
    public synchronized boolean bookRoom() throws OverbookingException {
        if (isAvailable==true) {
            isAvailable = false;
            return true;
        } else {
            throw new OverbookingException("Room " + roomNumber + " is already booked.");
        }
    }
    public synchronized void cancelRoom() {
        isAvailable = true;
        System.out.println("Booking for Room " +roomNumber+ " has been cancelled.");
    }
}
