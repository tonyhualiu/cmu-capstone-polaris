package edu.cmu.capstone.polaris.endpoint;

import edu.cmu.capstone.polaris.entity.GeneralInfoSearchResponse;
import edu.cmu.capstone.polaris.request.SearchRequest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Path("/customers")
@Api(value = "/custermers", description = "Search - customer informations")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerSearch {
	private static GeneralInfoSearchResponse test;

	@GET
	@Path("/{id}")
	@ApiOperation(value = "/custermers", notes = "Search - search customer information", response = GeneralInfoSearchResponse.class, responseContainer = "")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoSearchResponse searchBy(
			@PathParam("id") String id,
			@QueryParam("search") @ApiParam(value = "specific search requirement", required = true) String searchString,
			@QueryParam("sort") @DefaultValue("asc_rank") @ApiParam(value = "sorting ascending or descending", required = false) String order,
			@QueryParam("offset") @DefaultValue("0") @ApiParam(value = "pagination offset", required = false) int offest,
			@QueryParam("limit") @DefaultValue("10") @ApiParam(value = "pagination limit", required = false) int limit) {
		return test;
	}
}
