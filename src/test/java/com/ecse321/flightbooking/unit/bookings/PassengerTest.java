/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.unit.bookings;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.bookings.Passenger;

/**
 * @author ramisayar
 * 
 */
public class PassengerTest {

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Passenger#Passenger()}.
	 */
	@Test
	public void testPassenger() {
		final Passenger passenger = new Passenger();
		Assert.assertNull(passenger.getForename());
		Assert.assertNull(passenger.getSurname());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Passenger#Passenger(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testPassengerStringString() {
		final Passenger passenger = new Passenger("test", "test");
		Assert.assertEquals("test", passenger.getForename());
		Assert.assertEquals("test", passenger.getSurname());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Passenger#getSurname()}.
	 */
	@Test
	public void testGetSetSurname() {
		final Passenger passenger = new Passenger("test", "test");
		Assert.assertEquals("test", passenger.getSurname());

		passenger.setSurname("test2");
		Assert.assertEquals("test2", passenger.getSurname());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Passenger#getForename()}.
	 */
	@Test
	public void testGetForename() {
		final Passenger passenger = new Passenger("test", "test");
		Assert.assertEquals("test", passenger.getForename());

		passenger.setForename("test2");
		Assert.assertEquals("test2", passenger.getForename());
	}
}
