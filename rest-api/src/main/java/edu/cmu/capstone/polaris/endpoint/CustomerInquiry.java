package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import edu.cmu.capstone.polaris.entity.*;

@Path("/customers")
public class CustomerInquiry {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getComplete() {
		return new GeneralInfoInquiryResponse();
	}

	@GET
	@Path("/{id}/phone")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getPhone() {
		return new GeneralInfoInquiryResponse();
	}

	@GET
	@Path("/{id}/address")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getAddress() {
		return new GeneralInfoInquiryResponse();
	}

	@GET
	@Path("/{id}/email")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getEmail() {
		return new GeneralInfoInquiryResponse();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getAllContactInfo() {
		return new GeneralInfoInquiryResponse();
	}
}
