package edu.cmu.capstone.polaris.factory;

import com.seec.insurance.plm.customerinquiry.dataaccess.CustomerInquiryDA;
import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;
import com.seec.insurance.plm.customersearch.dataaccess.CustomerSearchDA;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResponse;

import edu.cmu.capstone.polaris.request.CMUCustomerInquiryRequest;
import edu.cmu.capstone.polaris.request.CMUCustomerSearchRequest;

/**
 * CMU's Implementation of ResponseFactory class.
 * @author tony
 *
 */
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

	@Override
	public CustomerSearchResponse getCustomerSearchResponseWithShortcut(
			CMUCustomerSearchRequest request,
			CustomerSearchShortcutType shortcut) {
		CustomerSearchDA searchDA = new CustomerSearchDA();
		switch(shortcut){
			case ZIPCODE:
				return searchDA.searchCustomerbyCityAndZip(null, request.getZip());
			case CITY:
				return searchDA.searchCustomerbyCityAndZip(request.getCity(), null);
			case FIRSTNAME:
				return searchDA.searchCustomerbyFirstAndLastName(request.getFirstName(), null);
			case LASTNAME:
				return searchDA.searchCustomerbyFieldName("lastname", request.lastName);
			case FULLNAME:
				return searchDA.searchCustomerbyFirstAndLastName(request.getFirstName(), request.getLastName());
		default:
			break;
		}
		return null;
	}

}
