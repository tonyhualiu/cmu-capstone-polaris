package com.seec.insurance.plm.customersearch.dataaccess;

import com.seec.insurance.plm.customersearch.interfaces.ICustomerSearch;
import com.seec.insurance.plm.customersearch.model.CustomerSearchRequest;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResponse;

public class CustomerSearchDA implements ICustomerSearch{

	public CustomerSearchResponse searchCustomer(CustomerSearchRequest rqObj){

		CustomerSearchResponse response = null;
		//TODO
		return response;
	}

	// fieldName{ LASTNAME, PHONE, EMAIL, SSN, ZIP }
	public CustomerSearchResponse searchCustomerbyFieldName(String fieldName, String value){
		
		CustomerSearchResponse response = null;
		//TODO
		return response;
	}
	public CustomerSearchResponse searchCustomerbyFirstAndLastName(String firstName, String lastName){
		
		CustomerSearchResponse response = null;
		//TODO
		return response;
	}
	
	public CustomerSearchResponse searchCustomerbyCityAndZip(String city, String zip){
		
		CustomerSearchResponse response = null;
		//TODO
		return response;
	}
	
}
