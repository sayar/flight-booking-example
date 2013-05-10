/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.unit.flights;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.flights.Airport;
import com.ecse321.flightbooking.flights.City;

/**
 * @author Rami Sayar
 * 
 */
public class AirportTest {

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.Airport#Airport()}.
	 */
	@Test
	public void testAirport() {
		final Airport airport = new Airport();
		Assert.assertNull(airport.getCity());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.Airport#Airport(com.ecse321.flightbooking.flights.City)}
	 * .
	 */
	@Test
	public void testAirportCity() {
		final City city = new City();
		final Airport airport = new Airport(city);
		Assert.assertEquals(city, airport.getCity());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.Airport#getCity()}.
	 */
	@Test
	public void testGetSetCity() {
		City city = new City();
		final Airport airport = new Airport(city);
		Assert.assertEquals(city, airport.getCity());
		// New reference
		city = new City();
		airport.setCity(city);
		Assert.assertEquals(city, airport.getCity());
	}
}
