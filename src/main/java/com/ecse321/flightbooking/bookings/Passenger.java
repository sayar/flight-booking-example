/**
 * Passenger class for holding information about the passenger on the flight.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.bookings;

/**
 * Passenger class for holding information about the passenger on the flight.
 * 
 * @author Rami Sayar
 * 
 */
final public class Passenger {
	private String surname = null;
	private String forename = null;

	/**
	 * Default constructor for the Passenger class.
	 */
	public Passenger() {
	}

	/**
	 * Constructor for the Passenger class which takes the surname and forename
	 * of the passenger.
	 * 
	 * @param surname
	 *            Passenger's surname.
	 * @param forename
	 *            Passenger's forename.
	 */
	public Passenger(final String surname, final String forename) {
		this.setSurname(surname);
		this.setForename(forename);
	}

	/**
	 * Getter for the passenger surname.
	 * 
	 * @return Passenger surname.
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Setter for the passenger surname.
	 * 
	 * @param surname
	 *            Passenger surname.
	 */
	public void setSurname(final String surname) {
		this.surname = surname;
	}

	/**
	 * Getter for the passenger forename.
	 * 
	 * @return Passenger forename.
	 */
	public String getForename() {
		return this.forename;
	}

	/**
	 * Setter for the passenger forename.
	 * 
	 * @param forename
	 *            Passenger forename.
	 */
	public void setForename(final String forename) {
		this.forename = forename;
	}
}
