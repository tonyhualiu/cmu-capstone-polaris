package edu.cmu.capstone.polaris.parser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.cmu.capstone.polaris.request.InquiryRequest;
import edu.cmu.capstone.polaris.request.Request;
import edu.cmu.capstone.polaris.request.SearchRequest;

public class PolarisAPIParser implements Parser {
	
	private static String ADDRESS = "address";
	private static String PHONE = "phone";
	private static String EMAIL = "email";
	private static String SOCIAL_ACCOUNT = "social_account";
	
	@Override
	public Request parseCustomerInquiryParameter(String paramContactInfo) {
		String[] tokens = paramContactInfo.trim().split(",");
		Request inquiryRequest = new InquiryRequest();
		for(String s: tokens){
			s = s.trim().toLowerCase();
			if(ADDRESS.equals(s)){
				
			}
			else if(PHONE.equals(s)){
				
			}
			else if(EMAIL.equals(s)){
				
			}
			else if(SOCIAL_ACCOUNT.equals(s)){
				
			}
		}
		
		return inquiryRequest;
	}

	@Override
	public SearchRequest parseSearchParameter(String param) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Test
//	public void testPolarisAPIParser(){
//		PolarisAPIParser test = new PolarisAPIParser();
//		String input = "address,phone";
//		String output = test.parseInquiryParameter(input);
//		assertEquals(address[0], test.parseInquiryParameter(input)[1]);
//	}

}
