// File name must be: RoomDemo.java

class Room {
    protected int roomNumber;
    protected String type;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public void display() {
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Room Type   : " + type);
    }
}

class DeluxeRoom extends Room {
    private String amenities;

    public DeluxeRoom(int roomNumber, String type, String amenities) {
        super(roomNumber, type);
        this.amenities = amenities;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Amenities   : " + amenities);
    }
}

public class roomDemo {
    public static void main(String[] args) {
        Room room = new Room(101, "Standard");
        System.out.println("--- Standard Room Details ---");
        room.display();

        System.out.println();

        DeluxeRoom deluxeRoom = new DeluxeRoom(201, "Deluxe", "WiFi, Mini Bar, Ocean View, Jacuzzi");
        System.out.println("--- Deluxe Room Details ---");
        deluxeRoom.display();
    }
}