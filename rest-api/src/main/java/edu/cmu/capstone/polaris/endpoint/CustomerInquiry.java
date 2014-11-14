package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import edu.cmu.capstone.polaris.entity.Address;
import edu.cmu.capstone.polaris.entity.GeneralInfoInquiryResponse;
import edu.cmu.capstone.polaris.entity.Phone;
import edu.cmu.capstone.polaris.request.InquiryRequest;

@Path("/customers")
@Api(value = "/custermers", description = "Inquiry - customer informations")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerInquiry {

	private static GeneralInfoInquiryResponse test;

	static {
		test = new GeneralInfoInquiryResponse();
		Phone p = new Phone();
		p.setDialNumber("123");
		test.setPhoneList(new Phone[] { p });
		test.setResultCode("123");
		Address add = new Address();
		add.setAddressCity("Pittsburgh");
		test.setAddressList(new Address[] { add });
	}

	@GET
	@Path("/{id}")
	@ApiOperation(value = "Get all information for this customer", notes = "Get all the information for a particular customer", response = GeneralInfoInquiryResponse.class, responseContainer = "")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getAll(
			@PathParam("id") String id,
			@QueryParam("info") @DefaultValue("all") @ApiParam(value = "info", required = false) String inquiryParam) {
		return test;
	}

}
