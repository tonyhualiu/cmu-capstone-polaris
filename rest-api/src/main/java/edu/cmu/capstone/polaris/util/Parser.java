package edu.cmu.capstone.polaris.util;

import edu.cmu.capstone.polaris.search.SortCondition;


/**
 * This interface defines all the parsing utility in the API.
 * @author tony
 *
 */
public interface Parser {
	/**
	 * Parse the inquiry parameter into an array of string specifying which fields are required.
	 * @param paramContactInfo
	 * @return
	 */
	public String[] parseCustomerInquiryParameter(String paramContactInfo);
	//public Request parseSearchParameter(String param);
	
	/**
	 * Parse the sort condition from the parameter
	 * @param paramSort
	 * @return
	 */
	public SortCondition parseSortConditionFromParameter(String paramSort);
	
	/**
	 * Parse the customer search "fullname" shortcut, to an array containing firstname and lastname.
	 * @param paramFullname
	 * @return
	 */
	public String[] parserCustomerSearchFullnameParameter(String paramFullname);
}
