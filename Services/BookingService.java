package Services;

import CoreClasses.Booking;
import CoreClasses.Show;
import CoreClasses.Seat;
import CoreClasses.User;
import Interfaces.ISeatLockProvider;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BookingService {

    // Stores all bookings made across shows (key = booking ID)
    // Changed to a thread-safe concurrent map.
    private final Map<String, Booking> showBookings;

    // Provider responsible for handling temporary seat locks
    private final ISeatLockProvider seatLockProvider;

    // Atomic integer to generate unique booking IDs
    private final AtomicInteger bookingIdCounter = new AtomicInteger(1);

    // Constructor to initialize dependencies
    public BookingService(ISeatLockProvider seatLockProvider) {
        this.seatLockProvider = seatLockProvider;
        this.showBookings = new ConcurrentHashMap<>();
    }

    
}
