package edu.cmu.capstone.polaris.factory;

import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResponse;

import edu.cmu.capstone.polaris.request.CMUCustomerInquiryRequest;
import edu.cmu.capstone.polaris.request.CMUCustomerSearchRequest;

/**
 * This interface defines the behavior of the factory, which takes a request object and response a response object.
 * @author tony
 *
 */
public interface ResponseFactory {
	
	/**
	 * Build CustomerInquiryResponse object from CMUCustomerInquiryRequest object.
	 * @param request - the request from endpoint
	 * @return inquiry response object
	 */
	public CustomerInquiryResponse getCustomerInquiryResponse(CMUCustomerInquiryRequest request);
	
	/**
	 * Build CustomerSearchResponse object from CMUCustomerSearchRequest and the shortcut type.
	 * @param request - the request form endpoint
	 * @param shortcut - the type of shortcut
	 * @return search response object
	 */
	public CustomerSearchResponse getCustomerSearchResponseWithShortcut(CMUCustomerSearchRequest request, CustomerSearchShortcutType shortcut);
}
