// File name must be: OccupancyDemo.java

public class OccupancyDemo {
    public static void main(String[] args) {
        int[] occupiedRoomsPerDay = {45, 60, 30, 0};

        // Change this to a non-zero value to see the normal (no exception) case
        int numberOfRooms = 0;

        try {
            int totalOccupancy = 0;
            for (int occupancy : occupiedRoomsPerDay) {
                totalOccupancy += occupancy;
            }

            int averageOccupancy = totalOccupancy / numberOfRooms; // may throw ArithmeticException
            System.out.println("Average Room Occupancy: " + averageOccupancy);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot compute average occupancy.");
            System.out.println("Reason: Number of rooms is zero (division by zero).");
            System.out.println("Exception Details: " + e.getMessage());
        } finally {
            System.out.println("Occupancy calculation attempt completed.");
        }
    }
}
