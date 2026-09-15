# Hotel Management – Java Assignment
Name:JAGAN M


## Problem A — Inheritance & Method Overriding

**Statement:** Create a class `Room` with attributes `roomNumber` and `type`, and a
constructor to initialize them. Create a subclass `DeluxeRoom` that adds an attribute
`amenities`. Override `display()` in `DeluxeRoom` to show all details (base fields +
amenities).

**Assigned Data:**
- Room: roomNumber = 101, type = "Standard"
- DeluxeRoom: roomNumber = 201, type = "Deluxe", amenities = "WiFi, Mini Bar, Ocean View, Jacuzzi"

**Sample Output:**
```
--- Standard Room Details ---
Room Number : 101
Room Type   : Standard

--- Deluxe Room Details ---
Room Number : 201
Room Type   : Deluxe
Amenities   : WiFi, Mini Bar, Ocean View, Jacuzzi
```

---

## Problem B — Abstract Class

**Statement:** Define an abstract class `Booking` with an abstract method
`confirmBooking()`. Extend it with a class `HotelBooking` that implements
`confirmBooking()`.

**Assigned Data:**
- HotelBooking: guestName = "John Smith", roomNumber = 201, checkInDate = "15-Sep-2026", numberOfNights = 3

**Sample Output:**
```
Booking Confirmed!
Guest Name     : John Smith
Room Number    : 201
Check-in Date  : 15-Sep-2026
Nights Booked  : 3
```

---

## Problem C — Exception Handling

**Statement:** Write a program that handles `ArithmeticException` while computing
average room occupancy when the number of rooms is zero.

**Assigned Data:**
- occupiedRoomsPerDay = {45, 60, 30, 0}
- numberOfRooms = 0

**Sample Output:**
```
Error: Cannot compute average occupancy.
Reason: Number of rooms is zero (division by zero).
Exception Details: / by zero
Occupancy calculation attempt completed.
```





