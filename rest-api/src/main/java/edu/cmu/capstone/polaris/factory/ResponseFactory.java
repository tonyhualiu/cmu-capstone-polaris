package edu.cmu.capstone.polaris.factory;

import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;

import edu.cmu.capstone.polaris.request.CMUCustomerInquiryRequest;

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
}
