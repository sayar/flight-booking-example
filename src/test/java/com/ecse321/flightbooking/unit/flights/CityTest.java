/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.unit.flights;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.flights.City;

/**
 * @author Rami Sayar
 * 
 */
public class CityTest {

	/**
	 * Test method for {@link com.ecse321.flightbooking.flights.City#City()}.
	 */
	@Test
	public void testCity() {
		final City city = new City();
		Assert.assertNull(city.getName());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.flights.City#City(java.lang.String)}.
	 */
	@Test
	public void testCityString() {
		final City city = new City("test");
		Assert.assertEquals("test", city.getName());
	}

	/**
	 * Test method for {@link com.ecse321.flightbooking.flights.City#getName()}.
	 */
	@Test
	public void testGetSetName() {
		final City city = new City("test");
		Assert.assertEquals("test", city.getName());
		city.setName("test2");
		Assert.assertEquals("test2", city.getName());
	}
}
