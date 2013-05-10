/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.integration;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.flights.AirlineCompany;
import com.ecse321.flightbooking.flights.Airport;
import com.ecse321.flightbooking.flights.City;
import com.ecse321.flightbooking.flights.Flight;
import com.ecse321.flightbooking.flights.StopoverInfo;

public class FlightsIntegrationTest {

	@Test
	public void testFlights() {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Create a set of cities, airports and airline company.
		final AirlineCompany airlineCompany = new AirlineCompany("Air Canada");
		final City montreal = new City("Montreal");
		final Airport montrealAirport = new Airport(montreal);
		final City timbuktu = new City("Timbuktu");
		final Airport timbuktuAirport = new Airport(timbuktu);
		final City paris = new City("Paris");
		final Airport CDG = new Airport(paris);

		try {
			// Demonstrate registration of a proper flight.
			final Flight flight = new Flight(sdf.parse("10/1/2013"),
					sdf.parse("14/1/2013"), montrealAirport, timbuktuAirport,
					10);
			final StopoverInfo inParis = new StopoverInfo(
					sdf.parse("11/1/2013"), sdf.parse("12/1/2013"), CDG);
			flight.addStopover(inParis);
			airlineCompany.registerFlight(flight);

			// Enjoy the flight.
		} catch (final ParseException e) {
			Assert.fail();
		}
	}
}
