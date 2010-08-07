package com.asp.sample.jersey.model.converter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.asp.sample.jersey.model.Employee;

/**
 * @author ASP
 * 
 */
@XmlRootElement(name = "employee")
public class EmployeeConverter {

	private Employee entity;

	public EmployeeConverter() {
	}

	public EmployeeConverter(Employee entity) {
		this.entity = entity;
	}

	@XmlElement
	public String getCompanyEmail() {
		return entity.getCompanyEmail();
	}

	@XmlElement
	public String getFirstName() {
		return entity.getFirstName();
	}

	@XmlElement
	public String getLastName() {
		return entity.getLastName();
	}

	/**
	 * @param companyEmail
	 *            the companyEmail to set
	 */
	public void setCompanyEmail(String companyEmail) {
		entity.setCompanyEmail(companyEmail);
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		entity.setFirstName(firstName);
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		entity.setLastName(lastName);
	}
}
