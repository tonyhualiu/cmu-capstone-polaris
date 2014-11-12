package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cmu.capstone.polaris.entity.GeneralInfoUpdateResponse;

@Path("/customers")
public class CustomerUpdate {
	private static GeneralInfoUpdateResponse test;

	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoUpdateResponse updateAll() {
		return test;
	}
}
