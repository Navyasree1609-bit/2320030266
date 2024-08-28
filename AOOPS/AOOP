package com;

import java.util.HashSet;
import java.util.Set;

public class App {
    
    public static void main(String[] args) {
        BookingPlatform platform = new BookingPlatform();

        // Create Observers
        UserNotification user1 = new UserNotification("User1");
        UserNotification user2 = new UserNotification("User2");

        // Register Observers with specific event types
        Set<EventType> user1Events = new HashSet<>();
        user1Events.add(EventType.FLIGHT_BOOKING);
        user1Events.add(EventType.FLIGHT_PAYMENT_CONFIRMATION);
        platform.registerObserver(user1, user1Events);

        Set<EventType> user2Events = new HashSet<>();
        user2Events.add(EventType.HOTEL_BOOKING);
        user2Events.add(EventType.HOTEL_PAYMENT_CONFIRMATION);
        platform.registerObserver(user2, user2Events);

        // Simulate bookings and payment confirmation
        platform.bookFlight("NY to LA");
        platform.bookHotel("Hilton");

        // User1 should get notifications for flight booking and payment confirmation
        // User2 should get notifications for hotel booking and payment confirmation
    }
}
