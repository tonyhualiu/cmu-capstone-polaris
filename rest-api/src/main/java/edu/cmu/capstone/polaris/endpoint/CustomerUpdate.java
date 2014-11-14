package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import edu.cmu.capstone.polaris.entity.GeneralInfoUpdateResponse;

@Path("/customers")
@Api(value = "/customers", description = "Update - update customer information")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerUpdate {
	private static GeneralInfoUpdateResponse test;

	@PUT
	@Path("/{id}")
	@ApiOperation(value = "Update information for this customer", notes = "update information for a customer", response = GeneralInfoUpdateResponse.class, responseContainer = "")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoUpdateResponse updateAll(@PathParam("id") String id) {
		return test;
	}
}
