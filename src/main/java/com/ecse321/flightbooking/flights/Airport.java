/**
 * Airport class.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.flights;

/**
 * Airport class.
 * 
 * @author Rami Sayar
 */
final public class Airport {
	private City city = null;

	/**
	 * Default constructor for the Airport class.
	 */
	public Airport() {
	}

	/**
	 * Constructor for Airport class which takes the city as a parameter.
	 * 
	 * @param city
	 *            City.
	 */
	public Airport(final City city) {
		this.setCity(city);
	}

	/**
	 * Getter for the Airport city.
	 * 
	 * @return City.
	 */
	public City getCity() {
		return this.city;
	}

	/**
	 * Setter for the Airport city.
	 * 
	 * @param city
	 *            Airport City.
	 */
	public void setCity(final City city) {
		this.city = city;
	}
}
