/**
 * Flight class capable of taking bookings.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.flights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.ecse321.flightbooking.bookings.Booking;

/**
 * Flight class capable of taking bookings.
 * 
 * @author Rami Sayar
 */
final public class Flight extends GenericFlight {
	private int bookingId = 0;
	private final List<Booking> bookings = new ArrayList<Booking>();

	public Flight() {
		super();
	}

	public Flight(final Date departureTime, final Date arrivalTime,
			final Airport departureAirport, final Airport arrivalAirport,
			final long validityPeriod) {
		super(departureTime, arrivalTime, departureAirport, arrivalAirport,
				validityPeriod);
	}

	/**
	 * Getter for the flight bookings.
	 * 
	 * @return
	 */
	public List<Booking> getBookings() {
		return Collections.unmodifiableList(this.bookings);
	}

	/**
	 * Open booking on the flight.
	 * 
	 * @param booking
	 *            Flight Booking.
	 */
	public void openBooking(final Booking booking) {
		// Set booking number
		booking.setBookingNumber(this.bookingId);
		this.bookings.add(booking);
		// Increment booking number.
		this.bookingId++;
	}

	/**
	 * Close booking for the flight.
	 * 
	 * @param booking
	 *            Flight Booking.
	 */
	public void closeBooking(final Booking booking) {
		this.bookings.remove(booking);
	}
}
