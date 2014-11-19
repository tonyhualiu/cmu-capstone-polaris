package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResponse;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import edu.cmu.capstone.polaris.entity.Address;
import edu.cmu.capstone.polaris.entity.GeneralInfoCreateResponse;
import edu.cmu.capstone.polaris.entity.GeneralInfoInquiryResponse;
import edu.cmu.capstone.polaris.entity.GeneralInfoSearchResponse;
import edu.cmu.capstone.polaris.entity.GeneralInfoUpdateResponse;
import edu.cmu.capstone.polaris.entity.Phone;
import edu.cmu.capstone.polaris.factory.CMUResponseFactory;
import edu.cmu.capstone.polaris.request.CMUCustomerInquiryRequest;
import edu.cmu.capstone.polaris.util.PolarisAPIJsonFilter;
import edu.cmu.capstone.polaris.util.PolarisAPIParser;

@Path("/customers")
@Api(value = "/customers", description = "Inquiry, Search, Create and Update customer information")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerEndpoint {

	public static String PARAM_INFO_NONE = "none";
	public static String PARAM_INFO_PHONE = "phone";
	public static String PARAM_INFO_EMAIL = "email";
	public static String PARAM_INFO_ADDRESS = "address";
	public static String PARAM_INFO_ALL = "all";

	private static GeneralInfoInquiryResponse inquiryTest;
	private static GeneralInfoUpdateResponse updateTest;
	private static GeneralInfoCreateResponse createTest;
	private static GeneralInfoSearchResponse searchTest;

	/**
	 * With the current data access interface, we are not able to response
	 * combination of contact information.
	 * 
	 * @param userId
	 * @param fields
	 * @return
	 */
	@GET
	@Path("/{id}")
	@ApiOperation(value = "Get all information for this customer", notes = "Get all the information for a particular customer", response = GeneralInfoInquiryResponse.class, responseContainer = "")
	@Produces(MediaType.APPLICATION_JSON)
	public String customerInquiry(@PathParam("id") String userId,
			@QueryParam("info") @DefaultValue("none") String fields) {
		
		String[] params = null;
		try {
			params = PolarisAPIParser.getParser()
					.parseCustomerInquiryParameter(fields);
		} catch (Exception e) {
			// TODO: handle the exception when user input a unrecognizable field
		}
		
		//for now, we assume the parsing result will be only one parameter
		CMUCustomerInquiryRequest cir = new CMUCustomerInquiryRequest();
		cir.setId(userId);
		
		addFiledToRequest(cir, params);
		
		CustomerInquiryResponse response = CMUResponseFactory.getInstance().getCustomerInquiryResponse(cir);
		
		String jsonResponse = null;
		
		jsonResponse = PolarisAPIJsonFilter.getInstance().customerInquiryResponseToJSON(response, params);
		
		return jsonResponse;
	}
	
	private void addFiledToRequest(CMUCustomerInquiryRequest request, String[] params){
		if(params[0].equals(PARAM_INFO_ADDRESS)){
			request.requireAddress();
			return;
		}
		else if(params[0].equals(PARAM_INFO_EMAIL)){
			request.requireEmail();
			return;
		}
		else if(params[0].equals(PARAM_INFO_PHONE)){
			request.requestHasPhone();
			return;
		}
		else if(params[0].equals(PARAM_INFO_ALL)){
			request.requireEmail();
			request.requirePhone();
			request.requireAddress();
			return;
		}
	}

	/*@PUT
	@Path("/{id}")
	@ApiOperation(value = "Update information for this customer", notes = "update information for a customer", response = GeneralInfoUpdateResponse.class, responseContainer = "")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoUpdateResponse updateAll(@PathParam("id") String id) {

		return updateTest;
	}

	@POST
	@ApiOperation(value = "Create a new customer", notes = "Create a new customer using the information in the JSON message", response = GeneralInfoCreateResponse.class, responseContainer = "")
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public GeneralInfoCreateResponse create() {
		return createTest;
	}

	@GET
	@Path("/")
	@ApiOperation(value = "/customers", notes = "Search - search customer information", response = GeneralInfoSearchResponse.class, responseContainer = "")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoSearchResponse searchBy(
			@ApiParam(value = "specific search requirement", required = true) @QueryParam("search") String searchString,
			@ApiParam(value = "sorting ascending or descending", required = false) @QueryParam("sort") @DefaultValue("asc_rank") String order,
			@ApiParam(value = "pagination offset", required = false) @QueryParam("offset") @DefaultValue("0") int offest,
			@ApiParam(value = "pagination limit", required = false) @QueryParam("limit") @DefaultValue("10") int limit) {
		return searchTest;
	}*/
	
	@GET
	@Path("search_by_zipcode")
	@ApiOperation(value = "search customer infomation by zipcode")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerSearchResponse searchByZipcode(
			@ApiParam(value = "the zipcode to search with", required = true) @QueryParam("search") String searchString,
			@ApiParam(value = "sorting ascending or descending", required = false) @QueryParam("sort") @DefaultValue("asc_rank") String order,
			@ApiParam(value = "pagination offset", required = false) @QueryParam("offset") @DefaultValue("0") int offest,
			@ApiParam(value = "pagination limit", required = false) @QueryParam("limit") @DefaultValue("10") int limit){
		
		
		return null;
	}
	
	@GET
	@Path("search_by_city")
	@ApiOperation(value = "search customer infomation by zipcode")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerSearchResponse searchByCity(
			@ApiParam(value = "the city to search with", required = true) @QueryParam("search") String searchString,
			@ApiParam(value = "sorting ascending or descending", required = false) @QueryParam("sort") @DefaultValue("asc_rank") String order,
			@ApiParam(value = "pagination offset", required = false) @QueryParam("offset") @DefaultValue("0") int offest,
			@ApiParam(value = "pagination limit", required = false) @QueryParam("limit") @DefaultValue("10") int limit){
		return null;
	}
	
	/*@GET
	@Path("search_by_state")
	@ApiOperation(value = "search customer infomation by state")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerSearchResponse searchByState(
			@ApiParam(value = "the state to search with", required = true) @QueryParam("search") String searchString,
			@ApiParam(value = "sorting ascending or descending", required = false) @QueryParam("sort") @DefaultValue("asc_rank") String order,
			@ApiParam(value = "pagination offset", required = false) @QueryParam("offset") @DefaultValue("0") int offest,
			@ApiParam(value = "pagination limit", required = false) @QueryParam("limit") @DefaultValue("10") int limit){
		return null;
	}*/
	
	@GET
	@Path("search_by_firstname")
	@ApiOperation(value = "search customer infomation by firstname")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerSearchResponse searchByFirstname(
			@ApiParam(value = "the firstname to search with", required = true) @QueryParam("search") String searchString,
			@ApiParam(value = "sorting ascending or descending", required = false) @QueryParam("sort") @DefaultValue("asc_rank") String order,
			@ApiParam(value = "pagination offset", required = false) @QueryParam("offset") @DefaultValue("0") int offest,
			@ApiParam(value = "pagination limit", required = false) @QueryParam("limit") @DefaultValue("10") int limit){
		return null;
	}
	
	@GET
	@Path("search_by_lastname")
	@ApiOperation(value = "search customer infomation by lastname")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerSearchResponse searchByLastname(
			@ApiParam(value = "the lastname to search with", required = true) @QueryParam("search") String searchString,
			@ApiParam(value = "sorting ascending or descending", required = false) @QueryParam("sort") @DefaultValue("asc_rank") String order,
			@ApiParam(value = "pagination offset", required = false) @QueryParam("offset") @DefaultValue("0") int offest,
			@ApiParam(value = "pagination limit", required = false) @QueryParam("limit") @DefaultValue("10") int limit){
		return null;
	}

}
