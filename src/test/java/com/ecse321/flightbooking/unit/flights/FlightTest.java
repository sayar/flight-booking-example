/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.unit.flights;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.bookings.Booking;
import com.ecse321.flightbooking.flights.Airport;
import com.ecse321.flightbooking.flights.Flight;
import com.ecse321.flightbooking.flights.StopoverInfo;

/**
 * @author Rami Sayar
 * 
 */
public class FlightTest {

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.Flight#getBookings()} .
	 */
	@Test
	public void testGetOpenBookings() {
		final Booking booking = new Booking();
		final Flight flight = new Flight();

		flight.openBooking(booking);
		Assert.assertTrue(0 == booking.getBookingNumber());
		flight.openBooking(booking);
		Assert.assertFalse(0 == booking.getBookingNumber());
		Assert.assertNotNull(flight.getBookings());
		Assert.assertEquals(2, flight.getBookings().size());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.Flight#closeBooking(com.ecse321.flightbooking.bookings.Booking)}
	 * .
	 */
	@Test
	public void testCloseBookingBooking() {
		final Booking booking = new Booking();
		final Flight flight = new Flight();

		flight.openBooking(booking);
		Assert.assertTrue(0 == booking.getBookingNumber());
		Assert.assertNotNull(flight.getBookings());
		Assert.assertEquals(1, flight.getBookings().size());

		flight.closeBooking(booking);
		Assert.assertEquals(0, flight.getBookings().size());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#GenericFlight()}.
	 */
	@Test
	public void testGenericFlight() {
		final Flight flight = new Flight();
		Assert.assertNull(flight.getDepartureTime());
		Assert.assertNull(flight.getArrivalTime());
		Assert.assertNull(flight.getDepartureAirport());
		Assert.assertNull(flight.getArrivalAirport());
		Assert.assertEquals(0, flight.getValidityPeriod());
		Assert.assertNull(flight.getFlightNumber());
		Assert.assertNotNull(flight.getStopovers());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#GenericFlight(java.util.Date, java.util.Date, com.ecse321.flightbooking.flights.Airport, com.ecse321.flightbooking.flights.Airport, long)}
	 * .
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGenericFlightDateDateAirportAirportLong()
			throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		final Airport departureAirport = new Airport();
		final Airport arrivalAirport = new Airport();
		final long valid = 10;

		final Flight flight = new Flight(departure, arrival, departureAirport,
				arrivalAirport, valid);

		Assert.assertEquals(departure, flight.getDepartureTime());
		Assert.assertEquals(arrival, flight.getArrivalTime());
		Assert.assertEquals(departureAirport, flight.getDepartureAirport());
		Assert.assertEquals(arrivalAirport, flight.getArrivalAirport());
		Assert.assertEquals(valid, flight.getValidityPeriod());
		Assert.assertNull(flight.getFlightNumber());
		Assert.assertNotNull(flight.getStopovers());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#getDepartureTime()}
	 * .
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGetSetDepartureTime() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		final Airport departureAirport = new Airport();
		final Airport arrivalAirport = new Airport();
		final long valid = 10;

		final Flight flight = new Flight(departure, arrival, departureAirport,
				arrivalAirport, valid);

		Assert.assertEquals(departure, flight.getDepartureTime());
		departure = new Date();
		flight.setDepartureTime(departure);
		Assert.assertEquals(departure, flight.getDepartureTime());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#getArrivalTime()}.
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGetSetArrivalTime() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		Date arrival = sdf.parse("21/12/2013");
		final Airport departureAirport = new Airport();
		final Airport arrivalAirport = new Airport();
		final long valid = 10;

		final Flight flight = new Flight(departure, arrival, departureAirport,
				arrivalAirport, valid);

		Assert.assertEquals(arrival, flight.getArrivalTime());
		arrival = new Date();
		flight.setArrivalTime(arrival);
		Assert.assertEquals(arrival, flight.getArrivalTime());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#getValidityPeriod()}
	 * .
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGetSetValidityPeriod() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		final Airport departureAirport = new Airport();
		final Airport arrivalAirport = new Airport();
		long valid = 10;

		final Flight flight = new Flight(departure, arrival, departureAirport,
				arrivalAirport, valid);

		Assert.assertEquals(valid, flight.getValidityPeriod());
		valid = 20;
		flight.setValidityPeriod(valid);
		Assert.assertEquals(valid, flight.getValidityPeriod());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#getDepartureAirport()}
	 * .
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGetSetDepartureAirport() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		Airport departureAirport = new Airport();
		final Airport arrivalAirport = new Airport();
		final long valid = 10;

		final Flight flight = new Flight(departure, arrival, departureAirport,
				arrivalAirport, valid);

		Assert.assertEquals(departureAirport, flight.getDepartureAirport());
		departureAirport = new Airport();
		flight.setDepartureAirport(departureAirport);
		Assert.assertEquals(departureAirport, flight.getDepartureAirport());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#getArrivalAirport()}
	 * .
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testGetSetArrivalAirport() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		final Date departure = sdf.parse("21/12/2012");
		final Date arrival = sdf.parse("21/12/2013");
		final Airport departureAirport = new Airport();
		Airport arrivalAirport = new Airport();
		final long valid = 10;

		final Flight flight = new Flight(departure, arrival, departureAirport,
				arrivalAirport, valid);

		Assert.assertEquals(arrivalAirport, flight.getArrivalAirport());
		arrivalAirport = new Airport();
		flight.setArrivalAirport(arrivalAirport);
		Assert.assertEquals(arrivalAirport, flight.getArrivalAirport());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#getFlightNumber()}
	 * .
	 */
	@Test
	public void testGetSetFlightNumber() {
		final Flight flight = new Flight();

		Assert.assertEquals(null, flight.getFlightNumber());
		flight.setFlightNumber(10);
		Assert.assertTrue(10 == flight.getFlightNumber());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#getStopovers()}.
	 */
	@Test
	public void testGetStopovers() {
		try {
			final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			final Flight flight = new Flight();
			flight.setDepartureTime(sdf.parse("21/12/2012"));
			flight.setArrivalTime(sdf.parse("21/12/2013"));

			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(0, flight.getStopovers().size());

			final StopoverInfo over = new StopoverInfo();
			over.setDepartureTime(sdf.parse("23/12/2012"));
			over.setArrivalTime(sdf.parse("21/1/2013"));

			flight.addStopover(over);

			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(1, flight.getStopovers().size());

		} catch (final ParseException e) {
			Assert.fail();
		}
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#addStopover(com.ecse321.flightbooking.flights.StopoverInfo)}
	 * .
	 */
	@Test
	public void testAddStopover() {
		try {
			final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			final Flight flight = new Flight();
			flight.setDepartureTime(sdf.parse("21/12/2012"));
			flight.setArrivalTime(sdf.parse("21/12/2013"));

			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(0, flight.getStopovers().size());

			final StopoverInfo over = new StopoverInfo();
			over.setDepartureTime(sdf.parse("23/12/2012"));
			over.setArrivalTime(sdf.parse("21/1/2013"));
			flight.addStopover(over);
			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(1, flight.getStopovers().size());
		} catch (final ParseException e) {
			Assert.fail();
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddStopoverOutOfRang() {
		try {
			final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			final Flight flight = new Flight();
			flight.setDepartureTime(sdf.parse("21/12/2012"));
			flight.setArrivalTime(sdf.parse("21/12/2013"));

			final StopoverInfo over = new StopoverInfo();
			over.setArrivalTime(sdf.parse("23/12/2015"));
			over.setDepartureTime(sdf.parse("21/1/2014"));
			flight.addStopover(over);

		} catch (final ParseException e) {
			Assert.fail();
		}
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#removeStopover(com.ecse321.flightbooking.flights.StopoverInfo)}
	 * .
	 */
	@Test
	public void testRemoveStopoverStopoverInfo() {
		try {
			final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			final Flight flight = new Flight();
			flight.setDepartureTime(sdf.parse("21/12/2012"));
			flight.setArrivalTime(sdf.parse("21/12/2013"));

			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(0, flight.getStopovers().size());

			final StopoverInfo over = new StopoverInfo();
			over.setDepartureTime(sdf.parse("23/12/2012"));
			over.setArrivalTime(sdf.parse("21/1/2013"));
			flight.addStopover(over);
			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(1, flight.getStopovers().size());

			flight.removeStopover(over);
			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(0, flight.getStopovers().size());

		} catch (final ParseException e) {
			Assert.fail();
		}
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#clearStopovers()}.
	 */
	@Test
	public void testClearStopovers() {
		try {
			final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			final Flight flight = new Flight();
			flight.setDepartureTime(sdf.parse("21/12/2012"));
			flight.setArrivalTime(sdf.parse("21/12/2013"));

			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(0, flight.getStopovers().size());

			final StopoverInfo over = new StopoverInfo();
			over.setDepartureTime(sdf.parse("23/12/2012"));
			over.setArrivalTime(sdf.parse("21/1/2013"));
			flight.addStopover(over);
			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(1, flight.getStopovers().size());

			flight.clearStopovers();
			Assert.assertNotNull(flight.getStopovers());
			Assert.assertEquals(0, flight.getStopovers().size());
		} catch (final ParseException e) {
			Assert.fail();
		}
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.GenericFlight#getLength()}.
	 */
	@Test
	public void testGetLength() {
		try {
			final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			final Flight flight = new Flight();
			final Date d = sdf.parse("21/12/2012");
			final Date d2 = sdf.parse("21/12/2013");
			flight.setDepartureTime(d);
			flight.setArrivalTime(d2);

			Assert.assertTrue((d2.getTime() - d.getTime()) == flight
					.getLength());
		} catch (final ParseException e) {
			Assert.fail();
		}
	}

	@Test(expected = NullPointerException.class)
	public void testGetLengthNull() {
		final Flight flight = new Flight();
		Assert.assertTrue(0 == flight.getLength());
	}
}
