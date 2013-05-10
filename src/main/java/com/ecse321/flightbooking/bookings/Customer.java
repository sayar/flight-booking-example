/**
 * Customer class containing information about customers for flight bookings.
 * 
 * @since June 13, 2013
 */
package com.ecse321.flightbooking.bookings;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer class containing information about customers for flight bookings.
 * 
 * @author Rami Sayar
 */
final public class Customer {
	private String surname;
	private String forename;
	private String address;
	private String telNum;
	private String faxNum;
	private final List<Booking> bookings = new ArrayList<Booking>();

	/**
	 * Default constructor for the Customer class.
	 */
	public Customer() {
	}

	/**
	 * Constructor for the Customer class which takes information through the
	 * parameters.
	 * 
	 * @param surname
	 *            Customer Surname.
	 * @param forename
	 *            Customer Forename.
	 * @param address
	 *            Customer Address.
	 * @param telNum
	 *            Customer Telephone Number.
	 * @param faxNum
	 *            Customer Fax Number.
	 */
	public Customer(final String surname, final String forename,
			final String address, final String telNum, final String faxNum) {
		this.setSurname(surname);
		this.setForename(forename);
		this.setAddress(address);
		this.setTelNum(telNum);
		this.setFaxNum(faxNum);
	}

	/**
	 * Getter for Customer Surname.
	 * 
	 * @return Customer Surname.
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Setter for Customer Surname.
	 * 
	 * @param surname
	 *            Customer Surname.
	 */
	public void setSurname(final String surname) {
		this.surname = surname;
	}

	/**
	 * Getter for Customer Forename.
	 * 
	 * @return Customer Forename.
	 */
	public String getForename() {
		return this.forename;
	}

	/**
	 * Setter for Customer Forename.
	 * 
	 * @param forename
	 *            Customer Forename
	 */
	public void setForename(final String forename) {
		this.forename = forename;
	}

	/**
	 * Getter for Customer Address.
	 * 
	 * @return Customer Address.
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * Setter for Customer Address.
	 * 
	 * @param address
	 *            Customer Address.
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

	/**
	 * Getter for Customer Telephone Number.
	 * 
	 * @return Customer Telephone Number.
	 */
	public String getTelNum() {
		return this.telNum;
	}

	/**
	 * Setter for Customer Telephone Number.
	 * 
	 * @param telNum
	 *            Customer Telephone Number.
	 */
	public void setTelNum(final String telNum) {
		this.telNum = telNum;
	}

	/**
	 * Getter for Customer Fax Number.
	 * 
	 * @return Customer Fax Number.
	 */
	public String getFaxNum() {
		return this.faxNum;
	}

	/**
	 * Setter for Customer Fax Number.
	 * 
	 * @param faxNum
	 *            Customer Fax Number.
	 */
	public void setFaxNum(final String faxNum) {
		this.faxNum = faxNum;
	}

	/**
	 * Getter for Customer Bookings.
	 * 
	 * @return Customer Bookings.
	 */
	public List<Booking> getBookings() {
		return this.bookings;
	}
}
