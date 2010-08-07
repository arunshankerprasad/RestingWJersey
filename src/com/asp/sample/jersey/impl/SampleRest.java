package com.asp.sample.jersey.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.asp.sample.jersey.model.Employee;
import com.asp.sample.jersey.model.converter.EmployeeConverter;

/**
 * @author ASP
 * 
 */
@Path("/asp/")
public class SampleRest {

	@GET
	@Produces({ "application/json", "application/xml" })
	@Path("/employee/{companyEmail}")
	public EmployeeConverter getSampleRest(
			@PathParam(value = "companyEmail") String companyEmail) {
		Employee employee = new Employee("", "", companyEmail);
		EmployeeConverter converter = new EmployeeConverter(employee);
		return converter;
	}
}
