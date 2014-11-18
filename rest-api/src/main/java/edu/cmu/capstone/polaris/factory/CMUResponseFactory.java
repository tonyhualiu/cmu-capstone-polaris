package edu.cmu.capstone.polaris.factory;

import com.seec.insurance.plm.customerinquiry.dataaccess.CustomerInquiryDA;
import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;

import edu.cmu.capstone.polaris.request.CMUCustomerInquiryRequest;

public class CMUResponseFactory implements ResponseFactory{
	
	private static CMUResponseFactory factory = null;
	protected CMUResponseFactory(){}
	
	public static CMUResponseFactory getInstance(){
		if(factory == null){
			return new CMUResponseFactory();
		}
		return factory;
	}
	
	@Override
	public CustomerInquiryResponse getCustomerInquiryResponse(
			CMUCustomerInquiryRequest request) {
		CustomerInquiryDA inquiryDataAccess = new CustomerInquiryDA();
		CustomerInquiryResponse response = null;
		if(request.requestHasAddress()){
			response = inquiryDataAccess.getCustomerAddressDetails(request.getId());
		}
		else if(request.requestHasEmail()){
			response = inquiryDataAccess.getCustomerEmailDetails(request.getId());
		}
		else if(request.requestHasPhone()){
			response = inquiryDataAccess.getCustomerPhoneDetails(request.getId());
		}
		else{
			response = inquiryDataAccess.getCustomerDetails(request.getId());
		}
		return response;
	}

}
