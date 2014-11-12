package edu.cmu.capstone.polaris.parser;

import edu.cmu.capstone.polaris.request.InquiryRequest;
import edu.cmu.capstone.polaris.request.SearchRequest;

/**
 * This interface defines all the parsing utility in the API.
 * @author tony
 *
 */
public interface Parser {
	public InquiryRequest parseInquiryParameter(String param);
	public SearchRequest parseSearchParameter(String param);
}
