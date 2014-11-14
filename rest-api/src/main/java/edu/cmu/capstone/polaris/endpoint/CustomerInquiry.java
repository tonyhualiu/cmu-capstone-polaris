package edu.cmu.capstone.polaris.endpoint;

import java.io.IOException;
import java.util.*;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import edu.cmu.capstone.polaris.entity.*;
import edu.cmu.capstone.polaris.views.Views;

@Path("/customers")
public class CustomerInquiry {
	
	private static GeneralInfoInquiryResponse test;
	
	static{
		test = new GeneralInfoInquiryResponse();
		Phone p = new Phone();
		p.setDialNumber("123");
		test.setPhoneList(new Phone[]{p});
		test.setResultCode("123");
		Address add = new Address();
		add.setAddressCity("Pittsburgh");
		test.setAddressList(new Address[]{add});
	}

	//****Please use this one
	//****The URL format /customers/{id}?info=[email,phone,address]
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getComplete(@PathParam("id") String userId,
            @DefaultValue("phone,address,email") @QueryParam("info") String fields)  {
		GeneralInfoInquiryResponse genResponse=null;
		
		StringTokenizer st = new StringTokenizer(fields, ",");
	    Set<String> filterProperties = new HashSet<String>();
	    while (st.hasMoreTokens()) {
	        filterProperties.add(st.nextToken());
	    }
	    
	    ObjectMapper mapper = new ObjectMapper();
	    FilterProvider filters = new SimpleFilterProvider().addFilter("filter",
	                SimpleBeanPropertyFilter.filterOutAllExcept(filterProperties));

	    String jsonResponse="";
	    try {
	    	ObjectWriter writer = mapper.writer(filters);
	    	jsonResponse=writer.writeValueAsString(genResponse);
	    } catch (IOException e) {
	        e.printStackTrace();
	    return e.getMessage();
	    }
	    
		return jsonResponse;
	}

	@GET
	@Path("/{id}/phone")
	@Produces(MediaType.APPLICATION_JSON)
	@JsonView(Views.PhoneView.class)
	public GeneralInfoInquiryResponse getPhone() {
		return test;
	}

	@GET
	@Path("/{id}/address")
	@Produces(MediaType.APPLICATION_JSON)
	@JsonView(Views.AddressView.class)
	public GeneralInfoInquiryResponse getAddress() {
		return test;
	}

	@GET
	@Path("/{id}/email")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getEmail() {
		return test;
	}

}
