/**
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.unit.bookings;

import org.junit.Assert;
import org.junit.Test;

import com.ecse321.flightbooking.bookings.Customer;

/**
 * @author ramisayar
 * 
 */
public class CustomerTest {

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Customer#Customer()} .
	 */
	@Test
	public void testCustomer() {
		final Customer customer = new Customer();
		Assert.assertNull(customer.getAddress());
		Assert.assertNull(customer.getFaxNum());
		Assert.assertNull(customer.getForename());
		Assert.assertNull(customer.getSurname());
		Assert.assertNull(customer.getTelNum());
		Assert.assertNotNull(customer.getBookings());
		Assert.assertEquals(0, customer.getBookings().size());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Customer#Customer(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testCustomerStringStringStringStringString() {
		final Customer customer = new Customer("test", "test", "test", "test",
				"test");
		Assert.assertEquals("test", customer.getAddress());
		Assert.assertEquals("test", customer.getFaxNum());
		Assert.assertEquals("test", customer.getForename());
		Assert.assertEquals("test", customer.getSurname());
		Assert.assertEquals("test", customer.getTelNum());
		Assert.assertNotNull(customer.getBookings());
		Assert.assertEquals(0, customer.getBookings().size());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Customer#getSurname()}.
	 */
	@Test
	public void testGetSetSurname() {
		final Customer customer = new Customer("test", "test", "test", "test",
				"test");
		Assert.assertEquals("test", customer.getSurname());

		customer.setSurname("test2");
		Assert.assertEquals("test2", customer.getSurname());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Customer#getForename()}.
	 */
	@Test
	public void testGetSetForename() {
		final Customer customer = new Customer("test", "test", "test", "test",
				"test");
		Assert.assertEquals("test", customer.getForename());
		customer.setForename("test2");
		Assert.assertEquals("test2", customer.getForename());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Customer#getAddress()}.
	 */
	@Test
	public void testGetSetAddress() {
		final Customer customer = new Customer("test", "test", "test", "test",
				"test");
		Assert.assertEquals("test", customer.getAddress());
		customer.setAddress("test2");
		Assert.assertEquals("test2", customer.getAddress());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Customer#getTelNum()}.
	 */
	@Test
	public void testGetSetTelNum() {
		final Customer customer = new Customer("test", "test", "test", "test",
				"test");
		Assert.assertEquals("test", customer.getTelNum());
		customer.setTelNum("test2");
		Assert.assertEquals("test2", customer.getTelNum());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Customer#getFaxNum()}.
	 */
	@Test
	public void testGetSetFaxNum() {
		final Customer customer = new Customer("test", "test", "test", "test",
				"test");
		Assert.assertEquals("test", customer.getFaxNum());
		customer.setFaxNum("test2");
		Assert.assertEquals("test2", customer.getFaxNum());
	}

	/**
	 * Test method for
	 * {@link com.ecse321.flightbooking.bookings.Customer#getBookings()}.
	 */
	@Test
	public void testGetBookings() {
		final Customer customer = new Customer();
		Assert.assertNotNull(customer.getBookings());
		Assert.assertTrue(0 == customer.getBookings().size());
	}

}
