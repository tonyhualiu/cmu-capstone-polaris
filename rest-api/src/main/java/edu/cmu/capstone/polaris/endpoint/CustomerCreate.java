package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import edu.cmu.capstone.polaris.entity.GeneralInfoCreateResponse;

@Path("/customers")
@Api(value = "/custermers", description = "Create - create new customer")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerCreate {
	private static GeneralInfoCreateResponse test;

	@POST
	@ApiOperation(value = "Create a new customer", notes = "Create a new customer using the information in the JSON message", response = GeneralInfoCreateResponse.class, responseContainer = "")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoCreateResponse create() {
		return test;
	}
}
