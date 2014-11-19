package com.seec.insurance.plm.customersearch.dataaccess;

import java.util.ArrayList;

import com.seec.insurance.plm.customersearch.interfaces.ICustomerSearch;
import com.seec.insurance.plm.customersearch.model.CustomerSearchRequest;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResponse;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResult;

public class CustomerSearchDA implements ICustomerSearch{
	
	private static CustomerSearchResponse response = null;
	static{
		response = new CustomerSearchResponse();
		response.setTotalRecordsFound(0);
		CustomerSearchResult result = new CustomerSearchResult();
		result.setPartyKey("Test");
		ArrayList<CustomerSearchResult> searchList = new ArrayList<CustomerSearchResult>();
		searchList.add(result);
		response.setSearchList(searchList);
	}

	public CustomerSearchResponse searchCustomer(CustomerSearchRequest rqObj){

		//CustomerSearchResponse response = null;
		//TODO
		return response;
	}

	// fieldName{ LASTNAME, PHONE, EMAIL, SSN, ZIP }
	public CustomerSearchResponse searchCustomerbyFieldName(String fieldName, String value){
		
		//CustomerSearchResponse response = null;
		//TODO
		return response;
	}
	public CustomerSearchResponse searchCustomerbyFirstAndLastName(String firstName, String lastName){
		
		//CustomerSearchResponse response = null;
		//TODO
		return response;
	}
	
	public CustomerSearchResponse searchCustomerbyCityAndZip(String city, String zip){
		
		//CustomerSearchResponse response = null;
		//TODO
		return response;
	}
	
}
