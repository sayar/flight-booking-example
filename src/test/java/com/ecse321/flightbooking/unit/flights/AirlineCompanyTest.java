/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.unit.flights;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.flights.AirlineCompany;
import com.ecse321.flightbooking.flights.Flight;

/**
 * @author Rami Sayar
 * 
 */
public class AirlineCompanyTest {

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.AirlineCompany#AirlineCompany()}
	 * .
	 */
	@Test
	public void testAirlineCompany() {
		final AirlineCompany airline = new AirlineCompany();
		Assert.assertNull(airline.getName());
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(0 == airline.getFlights().size());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.AirlineCompany#AirlineCompany(java.lang.String)}
	 * .
	 */
	@Test
	public void testAirlineCompanyString() {
		final AirlineCompany airline = new AirlineCompany("test");
		Assert.assertEquals("test", airline.getName());
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(0 == airline.getFlights().size());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.AirlineCompany#getName()}.
	 */
	@Test
	public void testGetSetName() {
		final AirlineCompany airline = new AirlineCompany("test");
		Assert.assertEquals("test", airline.getName());
		airline.setName("test2");
		Assert.assertEquals("test2", airline.getName());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.AirlineCompany#getFlights()}.
	 */
	@Test
	public void testGetFlights() {
		final AirlineCompany airline = new AirlineCompany("test");
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(0 == airline.getFlights().size());
		final Flight flight = new Flight();
		airline.registerFlight(flight);
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(1 == airline.getFlights().size());

	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.AirlineCompany#registerFlight(com.ecse321.flightbooking.flights.GenericFlight)}
	 * .
	 */
	@Test
	public void testRegisterFlight() {
		final AirlineCompany airline = new AirlineCompany("test");
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(0 == airline.getFlights().size());

		final Flight flight = new Flight();
		final int flightNum = airline.registerFlight(flight);

		Assert.assertTrue(flightNum == flight.getFlightNumber());
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(1 == airline.getFlights().size());
		Assert.assertEquals(flight, airline.getFlights().get(flightNum));

	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.AirlineCompany#unregisterFlight(java.lang.Integer)}
	 * .
	 */
	@Test
	public void testUnregisterFlight() {
		final AirlineCompany airline = new AirlineCompany("test");
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(0 == airline.getFlights().size());

		Flight flight = new Flight();
		final int flightNum = airline.registerFlight(flight);

		Assert.assertTrue(flightNum == flight.getFlightNumber());
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(1 == airline.getFlights().size());
		Assert.assertEquals(flight, airline.getFlights().get(flightNum));

		airline.unregisterFlight(flightNum);

		Assert.assertNull(flight.getFlightNumber());
		Assert.assertNotNull(airline.getFlights());
		Assert.assertTrue(1 == airline.getFlights().size());
		Assert.assertNull(airline.getFlights().get(flightNum));

		flight = new Flight();
		final int flightNum2 = airline.registerFlight(flight);
		Assert.assertFalse(flightNum == flightNum2);

	}

}
