package edu.cmu.capstone.polaris.factory;

import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResponse;

import edu.cmu.capstone.polaris.request.CMUCustomerInquiryRequest;
import edu.cmu.capstone.polaris.request.CMUCustomerSearchRequest;

/**
 * This class defines the behavior of the factory, which takes a request object and response a response object.
 * @author tony
 *
 */
public interface ResponseFactory {
	
	/**
	 * Build CustomerInquiryResponse object from CMUCustomerInquiryRequest object.
	 * @param request
	 * @return
	 */
	public CustomerInquiryResponse getCustomerInquiryResponse(CMUCustomerInquiryRequest request);
	

	public CustomerSearchResponse getCustomerSearchResponseWithShortcut(CMUCustomerSearchRequest request, CustomerSearchShortcutType shortcut);
}
