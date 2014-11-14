package edu.cmu.capstone.polaris.parser;

import edu.cmu.capstone.polaris.request.CustomerInquiryRequest;
import edu.cmu.capstone.polaris.request.Request;

/**
 * This interface defines all the parsing utility in the API.
 * @author tony
 *
 */
public interface Parser {
	public CustomerInquiryRequest parseCustomerInquiryParameter(String customerID, String paramContactInfo);
	public Request parseSearchParameter(String param);
}
