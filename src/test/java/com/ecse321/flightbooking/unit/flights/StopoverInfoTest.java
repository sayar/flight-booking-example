/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.unit.flights;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.flights.Airport;
import com.ecse321.flightbooking.flights.StopoverInfo;

/**
 * @author Rami Sayar
 * 
 */
public class StopoverInfoTest {

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.StopoverInfo#StopoverInfo()}.
	 */
	@Test
	public void testStopoverInfo() {
		final StopoverInfo info = new StopoverInfo();
		Assert.assertNull(info.getAirport());
		Assert.assertNull(info.getArrivalTime());
		Assert.assertNull(info.getDepartureTime());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.StopoverInfo#StopoverInfo(java.util.Date, java.util.Date, com.ecse321.flightbooking.flights.Airport)}
	 * .
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testStopoverInfoDateDateAirport() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		final Airport airport = new Airport();
		final StopoverInfo info = new StopoverInfo(departure, arrival, airport);
		Assert.assertEquals(airport, info.getAirport());
		Assert.assertEquals(arrival, info.getArrivalTime());
		Assert.assertEquals(departure, info.getDepartureTime());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.StopoverInfo#getAirport()}.
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGetSetAirport() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		final Airport airport = new Airport();
		final StopoverInfo info = new StopoverInfo(departure, arrival, airport);
		Assert.assertEquals(airport, info.getAirport());
		Assert.assertEquals(arrival, info.getArrivalTime());
		Assert.assertEquals(departure, info.getDepartureTime());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.StopoverInfo#getArrivalTime()}.
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGetSetArrivalTime() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		Date arrival = sdf.parse("21/12/2013");
		final Airport airport = new Airport();

		final StopoverInfo info = new StopoverInfo(departure, arrival, airport);
		Assert.assertEquals(arrival, info.getArrivalTime());

		arrival = new Date();
		info.setArrivalTime(arrival);
		Assert.assertEquals(arrival, info.getArrivalTime());

	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.StopoverInfo#getDepartureTime()}
	 * .
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGetSetDepartureTime() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		final Airport airport = new Airport();

		final StopoverInfo info = new StopoverInfo(departure, arrival, airport);
		Assert.assertEquals(departure, info.getDepartureTime());

		departure = new Date();
		info.setDepartureTime(departure);
		Assert.assertEquals(departure, info.getDepartureTime());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.StopoverInfo#length()}.
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testLength() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		Airport airport = new Airport();

		final StopoverInfo info = new StopoverInfo(departure, arrival, airport);
		Assert.assertEquals(airport, info.getAirport());

		airport = new Airport();
		info.setAirport(airport);
		Assert.assertEquals(airport, info.getAirport());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.StopoverInfo#equals(java.lang.Object)}
	 * .
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testEqualsObject() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		final Airport airport = new Airport();

		final StopoverInfo info = new StopoverInfo(departure, arrival, airport);
		final StopoverInfo info2 = new StopoverInfo(departure, arrival, airport);
		Assert.assertEquals(info, info2);
	}

}
