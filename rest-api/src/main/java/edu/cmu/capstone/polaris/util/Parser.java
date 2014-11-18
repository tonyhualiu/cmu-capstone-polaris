package edu.cmu.capstone.polaris.util;

import edu.cmu.capstone.polaris.request.Request;

/**
 * This interface defines all the parsing utility in the API.
 * @author tony
 *
 */
public interface Parser {
	public String[] parseCustomerInquiryParameter(String paramContactInfo);
	public Request parseSearchParameter(String param);
}
