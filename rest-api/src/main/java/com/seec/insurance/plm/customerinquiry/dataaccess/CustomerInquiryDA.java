package com.seec.insurance.plm.customerinquiry.dataaccess;

import java.util.ArrayList;

import com.seec.insurance.plm.customerinquiry.interfaces.ICustomerInquiry;
import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryRequest;
import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;
import com.seec.insurance.plm.customerinquiry.model.Phone;


public class CustomerInquiryDA implements ICustomerInquiry{
		static CustomerInquiryResponse response;
	static {
		 response = new CustomerInquiryResponse();
		Phone p = new Phone();
		p.setAreaCode("123");
		p.setCountryCode("456");
		p.setDialNumber("789");
		p.setIsPreferedPhone("123");
		p.setPhoneKey("PP");
		ArrayList<Phone> phonelist = new ArrayList<Phone>();
		phonelist.add(p);
		response.setPhoneList(phonelist);
	}
	
	public CustomerInquiryResponse getCustomer(CustomerInquiryRequest rqObj){
    	//CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
    	return response;
	}
		
	public CustomerInquiryResponse getCustomerDetails(String partyKey){
    	
    	//CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
    	return response;
    }

    public CustomerInquiryResponse getCustomerAddressDetails(String partyKey){

    	//CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
    	return response;

    }

    public CustomerInquiryResponse getCustomerPhoneDetails(String partyKey){

    	//CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO
    	return response;

    }

    public CustomerInquiryResponse getCustomerEmailDetails(String partyKey){

    	//CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
    	return response;

    }

	public CustomerInquiryResponse prepareErrorResponse(String errorMesg, String errorCode){
		
		//CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
		return response;
		
	}
	
	public CustomerInquiryResponse getCoustomer(String partyKey){
		
		//CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO
		return response;
		
	}
}
