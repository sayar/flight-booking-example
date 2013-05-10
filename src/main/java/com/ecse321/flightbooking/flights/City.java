/**
 * City class for holding information about the cities on the flight path.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.flights;

/**
 * City class for holding information about the cities on the flight path.
 * 
 * @author Rami Sayar
 * 
 */
final public class City {
	private String name = null;

	/**
	 * Default constructor for the City class.
	 */
	public City() {
	}

	/**
	 * Constructor for the City class which takes the name of the city.
	 * 
	 * @param name
	 *            City Name.
	 */
	public City(final String name) {
		this.setName(name);
	}

	/**
	 * Getter for the city name.
	 * 
	 * @return City name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Setter for the city name.
	 * 
	 * @param name
	 *            City Name.
	 */
	public void setName(final String name) {
		this.name = name;
	}

}
