package com.asp.sample.jersey.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author ASP
 *
 */
@Path("/asp/")
public class SampleRest {

	@GET
	@Produces("text/plain")
	@Path("/echo")
	public String getSampleRest() {
		return "ASP";
	}
}
