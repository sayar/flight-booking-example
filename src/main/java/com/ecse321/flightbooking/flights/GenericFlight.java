/**
 * Generic Flight class used to describe a flight, its departure time, its arrival time and the stopovers it contains.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.flights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Generic Flight class used to describe a flight, its departure time, its
 * arrival time and the stopovers it contains.
 * 
 * @author Rami Sayar
 * 
 */
public abstract class GenericFlight {
	private Date departureTime = null;
	private Date arrivalTime = null;
	private long validityPeriod = 0;
	private Airport departureAirport = null;
	private Airport arrivalAirport = null;
	private final List<StopoverInfo> stopovers = new ArrayList<StopoverInfo>();
	private Integer flightNumber = null;

	/**
	 * Default constructor for the GenericFlight class.
	 */
	public GenericFlight() {
	}

	/**
	 * Constructor for the GenericFlight class which takes all the class
	 * variables as parameters.
	 * 
	 * @param departureTime
	 *            Departure time.
	 * @param arrivalTime
	 *            Arrival time.
	 * @param departureAirport
	 *            Departure airport.
	 * @param arrivalAirport
	 *            Arrival airport.
	 * @param validityPeriod
	 *            Validity period.
	 */
	public GenericFlight(final Date departureTime, final Date arrivalTime,
			final Airport departureAirport, final Airport arrivalAirport,
			final long validityPeriod) {
		this.setDepartureTime(departureTime);
		this.setArrivalTime(arrivalTime);
		this.setDepartureAirport(departureAirport);
		this.setArrivalAirport(arrivalAirport);
		this.setValidityPeriod(validityPeriod);
	}

	/**
	 * Getter for the departure time for the flight.
	 * 
	 * @return Departure time.
	 */
	public Date getDepartureTime() {
		return this.departureTime;
	}

	/**
	 * Setter for the departure time for the flight.
	 * 
	 * @param departureTime
	 *            Departure Time
	 */
	public void setDepartureTime(final Date departureTime) {
		// Check if the new the departure time is not null;
		if (departureTime != null) {
			// If an arrival time is not set, accept the new departure time.
			// Or if an arrival time is set, accept the new departure time only
			// if it is before the arrival time.
			if ((this.getArrivalTime() == null)
					|| departureTime.before(this.getArrivalTime())) {
				this.departureTime = departureTime;
			} else {
				throw new NullPointerException();
			}
		} else {
			throw new NullPointerException();
		}
	}

	/**
	 * Getter for the arrival time for the flight.
	 * 
	 * @return Arrival time.
	 */
	public Date getArrivalTime() {
		return this.arrivalTime;
	}

	/**
	 * Setter for the arrival time for the flight.
	 * 
	 * @param arrivalTime
	 *            Arrival time.
	 */
	public void setArrivalTime(final Date arrivalTime) {
		// Check if the new the departure time is not null;
		if (arrivalTime != null) {
			// If an departure time is not set, accept the new arrival time.
			// Or if an departure time is set, accept the new arrival time only
			// if it is after the the departure time.
			if ((this.getDepartureTime() == null)
					|| arrivalTime.after(this.getDepartureTime())) {
				this.arrivalTime = arrivalTime;
			} else {
				throw new NullPointerException();
			}
		} else {
			throw new NullPointerException();
		}
	}

	/**
	 * Getter for the flight validity period.
	 * 
	 * @return Validity period.
	 */
	public long getValidityPeriod() {
		return this.validityPeriod;
	}

	/**
	 * Setter for the flight validity period.
	 * 
	 * @param validityPeriod
	 *            Validity period.
	 */
	public void setValidityPeriod(final long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	/**
	 * Getter for the departure airport.
	 * 
	 * @return Departure airport.
	 */
	public Airport getDepartureAirport() {
		return this.departureAirport;
	}

	/**
	 * Setter for the departure airport.
	 * 
	 * @param departureAirport
	 *            Departure airport.
	 */
	public void setDepartureAirport(final Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	/**
	 * Getter for the arrival airport.
	 * 
	 * @return Arrival airport.
	 */
	public Airport getArrivalAirport() {
		return this.arrivalAirport;
	}

	/**
	 * Setter for the arrival airport.
	 * 
	 * @param arrivalAirport
	 *            Arrival airport.
	 */
	public void setArrivalAirport(final Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	/**
	 * Getter for the flight number.
	 * 
	 * @return Flight Number.
	 */
	public Integer getFlightNumber() {
		return this.flightNumber;
	}

	/**
	 * Setter for the flight number.
	 * 
	 * @param flightNumber
	 *            Flight Number.
	 */
	public void setFlightNumber(final Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Getter for a read-only version of the stopovers list.
	 * 
	 * @return Stopovers list.
	 */
	public List<StopoverInfo> getStopovers() {
		return Collections.unmodifiableList(this.stopovers);
	}

	/**
	 * Add a stopover to the flight. The stopover must be within the time of the
	 * entire flight.
	 * 
	 * @param stopover
	 *            Stopover
	 */
	public void addStopover(final StopoverInfo stopover) {
		// We need to ensure the stopover is properly initialized and that the
		// stopover is within the departure and arrival time for the entire
		// flight.
		if (((stopover.getDepartureTime() != null) && (stopover
				.getDepartureTime().getTime() < this.getArrivalTime().getTime()))
				&& ((stopover.getArrivalTime() != null) && (stopover
						.getArrivalTime().getTime() > this.getDepartureTime()
						.getTime()))) {
			this.stopovers.add(stopover);

		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Remove a stopover based on its values.
	 * 
	 * @param stopover
	 *            Stopover to remove.
	 */
	public void removeStopover(final StopoverInfo stopover) {
		this.stopovers.remove(stopover);
	}

	/**
	 * Removes all stopovers.
	 */
	public void clearStopovers() {
		this.stopovers.clear();
	}

	/**
	 * Get the length of the flight.
	 * 
	 * @return Flight length.
	 */
	public long getLength() {
		if ((this.getArrivalTime() != null)
				&& (this.getDepartureTime() != null)) {
			return this.getArrivalTime().getTime()
					- this.getDepartureTime().getTime();
		} else {
			throw new NullPointerException();
		}
	}
}
