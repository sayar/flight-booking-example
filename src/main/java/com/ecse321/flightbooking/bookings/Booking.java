/**
 * Booking class indicating a flight booking.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.bookings;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Booking class indicating a flight booking.
 * 
 * @author Rami Sayar
 * 
 */
public class Booking {
	private Integer number;
	private final Date date = new Date();
	private Customer customer;
	private List<Passenger> passengers = new ArrayList<Passenger>();

	/**
	 * Default constructor for the Booking class.
	 */
	public Booking() {
	}

	/**
	 * Constructor for the Booking class which takes information through the
	 * parameters.
	 * 
	 * @param date
	 *            Booking Date.
	 */
	public Booking(final Customer customer, final List<Passenger> passengers) {
		this.setCustomer(customer);
		this.setPassengers(passengers);
	}

	/**
	 * Getter for Booking Number.
	 * 
	 * @return Booking Number.
	 */
	public Integer getBookingNumber() {
		return this.number;
	}

	/**
	 * Setter for Booking Number.
	 * 
	 * @param bookingNumber
	 *            Booking Number.
	 */
	public void setBookingNumber(final Integer bookingNumber) {
		this.number = bookingNumber;
	}

	/**
	 * Getter for the Booking Date.
	 * 
	 * @return Booking Date.
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * Getter for Booking Customer.
	 * 
	 * @return Booking Customer.
	 */
	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * Setter for Booking Customer.
	 * 
	 * @param customer
	 *            Booking Customer.
	 */
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	/**
	 * Getter for Passengers in the Booking.
	 * 
	 * @return Passengers.
	 */
	public List<Passenger> getPassengers() {
		return this.passengers;
	}

	/**
	 * Setter for Passengers in the Booking.
	 * 
	 * @param passengers
	 *            Booking Passengers
	 */
	public void setPassengers(final List<Passenger> passengers) {
		this.passengers = passengers;
	}
}
