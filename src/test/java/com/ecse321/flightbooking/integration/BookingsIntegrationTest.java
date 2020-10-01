/**- For Testing
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.integration;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ecse321.flightbooking.bookings.Booking;
import com.ecse321.flightbooking.bookings.Customer;
import com.ecse321.flightbooking.bookings.Passenger;
import com.ecse321.flightbooking.flights.Flight;

/**
 * @author Rami Sayar
 * 
 */
public class BookingsIntegrationTest {
	@Test
	public void testBookingCustomer() {

		final Customer customer = new Customer("Test", "Test", "Test", "Test",
				"Test");
		final List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(new Passenger("Test", "Test"));
		final Booking booking = new Booking(customer, passengers);

		final Flight flight = new Flight();
		flight.openBooking(booking);

	}
}
