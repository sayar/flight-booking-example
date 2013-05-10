/**
 * Airline company class holding all flights.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.flights;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Airline company class holding all flights.
 * 
 * @author Rami Sayar
 */
final public class AirlineCompany {
	private String name = null;
	private final Map<Integer, GenericFlight> flights = new HashMap<Integer, GenericFlight>();

	/**
	 * Default constructor for the AirlineCompany class.
	 */
	public AirlineCompany() {
	}

	/**
	 * Constructor for the AirlineCompany class which takes the default name.
	 * 
	 * @param name
	 *            Airline Company Name.
	 */
	public AirlineCompany(final String name) {
		this.setName(name);
	}

	/**
	 * Getter for the airline company name.
	 * 
	 * @return Airline Company Name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Setter for the airline company name.
	 * 
	 * @param name
	 *            Airline Company Name.
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get all registered flights for this airline company.
	 * 
	 * @return Unmodifiable list of registered flights.
	 */
	public Map<Integer, GenericFlight> getFlights() {
		return Collections.unmodifiableMap(this.flights);
	}

	/**
	 * Register a flight with the airline company.
	 * 
	 * @return Returns Flight Number.
	 */
	public int registerFlight(final GenericFlight flight) {
		// Register a flight, use the size of the hash to generate a flight
		// number.
		final Integer num = this.flights.size();
		this.flights.put(num, flight);
		flight.setFlightNumber(num);
		return num;
	}

	/**
	 * Unregister flight with the airline company.
	 * 
	 * @param flightNumber
	 *            Flight Number.
	 */
	public void unregisterFlight(final Integer flightNumber) {
		if (this.flights.containsKey(flightNumber)) {
			this.flights.get(flightNumber).setFlightNumber(null);
			// Set the flight number to null (can't remove as that would set the
			// next flight at the wrong number/index.
			this.flights.put(flightNumber, null);
		}
	}
}
