// File name must be: BookingDemo.java

abstract class Booking {
    protected String guestName;
    protected int roomNumber;

    public Booking(String guestName, int roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    // Abstract method - must be implemented by subclasses
    public abstract void confirmBooking();
}

class HotelBooking extends Booking {
    private String checkInDate;
    private int numberOfNights;

    public HotelBooking(String guestName, int roomNumber, String checkInDate, int numberOfNights) {
        super(guestName, roomNumber);
        this.checkInDate = checkInDate;
        this.numberOfNights = numberOfNights;
    }

    @Override
    public void confirmBooking() {
        System.out.println("Booking Confirmed!");
        System.out.println("Guest Name     : " + guestName);
        System.out.println("Room Number    : " + roomNumber);
        System.out.println("Check-in Date  : " + checkInDate);
        System.out.println("Nights Booked  : " + numberOfNights);
    }
}

public class BookingDemo {
    public static void main(String[] args) {
        // Using the parent (abstract) type as the reference - polymorphism
        Booking booking = new HotelBooking("John Smith", 201, "15-Sep-2026", 3);
        booking.confirmBooking();
    }
}
