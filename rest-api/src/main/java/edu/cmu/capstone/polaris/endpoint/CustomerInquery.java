package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cmu.capstone.polaris.entity.CustomerWithAddress;
import edu.cmu.capstone.polaris.entity.CustomerWithPhone;

@Path("/customers")
public class CustomerInquery {
	
	@GET
	@Path("/{id}/phone")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerWithPhone getPhone (){
		return new CustomerWithPhone();
	}
	
	@GET
	@Path("/{id}/address")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerWithAddress getAddress(){
		throw new RuntimeException();
	}
	/*
	@GET
	@Path("/{id}/email")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerWithEmail getEmail(){}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerComplete getAllContactInfo(){
	}*/
}
