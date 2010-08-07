package com.asp.sample.jersey.model;

/**
 * @author ASP
 * 
 */
public class Employee {

	private String firstName;
	private String lastName;
	private String companyEmail;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String companyEmail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyEmail = companyEmail;
	}

	/**
	 * @return the companyEmail
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param companyEmail
	 *            the companyEmail to set
	 */
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
