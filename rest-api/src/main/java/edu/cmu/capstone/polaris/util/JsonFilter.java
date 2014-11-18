package edu.cmu.capstone.polaris.util;

import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryResponse;

/**
 * This interface defines the JSON Mapping utilities for the API.
 * @author tony
 *
 */
public interface JsonFilter {
	/**
	 * Map the CustomerInquiryResponse to JSON message. 
	 * @param customerInquiryResponse
	 * @return
	 */
	public String customerInquiryResponseToJSON(CustomerInquiryResponse customerInquiryResponse, String[] requiredField);
}
