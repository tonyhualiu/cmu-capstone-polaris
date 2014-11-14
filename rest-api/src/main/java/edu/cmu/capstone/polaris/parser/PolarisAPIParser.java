package edu.cmu.capstone.polaris.parser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.cmu.capstone.polaris.error.InquiryFieldNotExistException;
import edu.cmu.capstone.polaris.request.CustomerInquiryRequest;
import edu.cmu.capstone.polaris.request.InquiryRequest;
import edu.cmu.capstone.polaris.request.Request;
import edu.cmu.capstone.polaris.request.SearchRequest;

public class PolarisAPIParser implements Parser {

	private static String ADDRESS = "address";
	private static String PHONE = "phone";
	private static String EMAIL = "email";
	private static String SOCIAL_ACCOUNT = "social_account";

	@Override
	public CustomerInquiryRequest parseCustomerInquiryParameter(String customerID,
			String paramContactInfo) throws InquiryFieldNotExistException {
		String[] tokens = paramContactInfo.trim().split(",");
		CustomerInquiryRequest inquiryRequest = new CustomerInquiryRequest();
		for (String s : tokens) {
			String trimedlowercase = s.trim().toLowerCase();
			if (ADDRESS.equals(trimedlowercase)) {
				inquiryRequest.requireAddress();
			} else if (PHONE.equals(trimedlowercase)) {
				inquiryRequest.requirePhone();
			} else if (EMAIL.equals(trimedlowercase)) {
				inquiryRequest.requireEmail();
			} else if (SOCIAL_ACCOUNT.equals(trimedlowercase)) {
				inquiryRequest.requireEmail();
			} else {
				throw new InquiryFieldNotExistException(s);
			}
		}
		inquiryRequest.setCustomerID(customerID);
		return inquiryRequest;
	}

	@Override
	public SearchRequest parseSearchParameter(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	// @Test
	// public void testPolarisAPIParser(){
	// PolarisAPIParser test = new PolarisAPIParser();
	// String input = "address,phone";
	// String output = test.parseInquiryParameter(input);
	// assertEquals(address[0], test.parseInquiryParameter(input)[1]);
	// }

}
