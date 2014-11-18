package com.seec.insurance.plm.customerinquiry.dataaccess;

import com.seec.insurance.plm.customerinquiry.interfaces.ICustomerInquiry;
import com.seec.insurance.plm.customerinquiry.model.CustomerDetails;
import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryRequest;
import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;

public class CustomerInquiryDA implements ICustomerInquiry{
		
	public CustomerInquiryResponse getCustomer(CustomerInquiryRequest rqObj){
    	CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
    	return response;
	}
		
	public CustomerInquiryResponse getCustomerDetails(String partyKey){
    	
    	CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
    	return response;
    }

    public CustomerInquiryResponse getCustomerAddressDetails(String partyKey){

    	CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
    	return response;

    }

    public CustomerInquiryResponse getCustomerPhoneDetails(String partyKey){

    	CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO
    	return response;

    }

    public CustomerInquiryResponse getCustomerEmailDetails(String partyKey){

    	CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
    	return response;

    }

	public CustomerInquiryResponse prepareErrorResponse(String errorMesg, String errorCode){
		
		CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO		
		return response;
		
	}
	
	public CustomerInquiryResponse getCoustomer(String partyKey){
		
		CustomerInquiryResponse response = new CustomerInquiryResponse();
		// TODO
		return response;
		
	}
}
