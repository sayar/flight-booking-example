/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.unit.bookings;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.bookings.Booking;
import com.ecse321.flightbooking.bookings.Customer;
import com.ecse321.flightbooking.bookings.Passenger;

/**
 * @author Rami Sayar
 * 
 */
public class BookingTest {

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Booking#Booking()}.
	 */
	@Test
	public void testBooking() {
		final Booking booking = new Booking();
		Assert.assertNull(booking.getBookingNumber());
		Assert.assertNull(booking.getCustomer());
		Assert.assertNotNull(booking.getDate());
		Assert.assertNotNull(booking.getPassengers());
		Assert.assertEquals(0, booking.getPassengers().size());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Booking#Booking(com.ecse321.flightbooking.bookings.Customer, java.util.List)}
	 * .
	 */
	@Test
	public void testBookingCustomerListOfPassenger() {
		final Customer customer = new Customer();
		final Passenger passenger = new Passenger();
		final List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(passenger);

		final Booking booking = new Booking(customer, passengers);
		Assert.assertEquals(customer, booking.getCustomer());
		Assert.assertEquals(passengers, booking.getPassengers());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Booking#getBookingNumber()}.
	 */
	@Test
	public void testGetSetBookingNumber() {
		final Booking booking = new Booking();
		booking.setBookingNumber(10);
		Assert.assertTrue(10 == booking.getBookingNumber());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Booking#getCustomer()}.
	 */
	@Test
	public void testGetSetCustomer() {
		Customer customer = new Customer();
		final Passenger passenger = new Passenger();
		final List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(passenger);

		final Booking booking = new Booking(customer, passengers);
		Assert.assertEquals(customer, booking.getCustomer());

		customer = new Customer();
		booking.setCustomer(customer);
		Assert.assertEquals(customer, booking.getCustomer());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Booking#getPassengers()}.
	 */
	@Test
	public void testGetSetPassengers() {
		final Customer customer = new Customer();
		final Passenger passenger = new Passenger();
		List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(passenger);

		final Booking booking = new Booking(customer, passengers);
		Assert.assertEquals(passengers, booking.getPassengers());

		// New Reference
		passengers = new ArrayList<Passenger>();
		passengers.add(passenger);
		Assert.assertEquals(passengers, booking.getPassengers());
	}
}
