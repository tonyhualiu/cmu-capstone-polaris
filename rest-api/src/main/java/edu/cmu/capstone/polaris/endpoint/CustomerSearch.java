package edu.cmu.capstone.polaris.endpoint;

import edu.cmu.capstone.polaris.entity.GeneralInfoSearchResponse;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers")
public class CustomerSearch {
	private static GeneralInfoSearchResponse test;

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoSearchResponse search(@QueryParam("search")) {
		return test;
	}
}
