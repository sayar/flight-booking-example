/**
 * StopoverInfo class for holding stop over information in a flight.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.flights;

import java.util.Date;

/**
 * StopoverInfo class for holding stop over information in a flight.
 * 
 * @author Rami Sayar
 * 
 */
final public class StopoverInfo {
	private Date departureTime = null;
	private Date arrivalTime = null;
	private Airport airport = null;

	/**
	 * Default constructor for the StopoverInfo class.
	 */
	public StopoverInfo() {
	}

	/**
	 * Constructor for the StopoverInfo class which takes the departure time and
	 * arrival time as parameters.
	 * 
	 * @param departureTime
	 *            Departure time.
	 * @param arrivalTime
	 *            Arrival time.
	 * @param airport
	 *            Stop over Airport
	 */
	public StopoverInfo(final Date departureTime, final Date arrivalTime,
			final Airport airport) {
		this.setDepartureTime(departureTime);
		this.setArrivalTime(arrivalTime);
		this.setAirport(airport);
	}

	/**
	 * Getter for the airport stop over.
	 * 
	 * @return Airport.
	 */
	public Airport getAirport() {
		return this.airport;
	}

	/**
	 * Setter for the airport stop over.
	 * 
	 * @param airport
	 *            Airport
	 */
	public void setAirport(final Airport airport) {
		this.airport = airport;
	}

	/**
	 * Getter for the arrival time.
	 * 
	 * @return Arrival Time.
	 */
	public Date getArrivalTime() {
		return this.arrivalTime;
	}

	/**
	 * Setter for the arrival time.
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
	 * Getter for the departure time.
	 * 
	 * @return Departure time.
	 */
	public Date getDepartureTime() {
		return this.departureTime;
	}

	/**
	 * Setter for the departure time.
	 * 
	 * @param departureTime
	 *            Departure time.
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
	 * Calculates the difference between the arrival and departure time.
	 * 
	 * @return Due to the Java API, this method returns the difference in
	 *         milliseconds in a long type.
	 */
	public long length() {
		return this.arrivalTime.getTime() - this.departureTime.getTime();
	}

	/**
	 * Overrides the equals method.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof StopoverInfo) {
			final StopoverInfo other = (StopoverInfo) obj;
			return (other.getDepartureTime() == this.getDepartureTime())
					&& (other.getArrivalTime() == this.getArrivalTime())
					&& (other.getAirport() == this.getAirport());

		} else {
			return false;
		}

	}
}
