package edu.cmu.capstone.polaris.parser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.cmu.capstone.polaris.request.InquiryRequest;
import edu.cmu.capstone.polaris.request.SearchRequest;

public class PolarisAPIParser implements Parser {
	
	@Override
	public InquiryRequest parseInquiryParameter(String param) {
		String[] tokens = param.trim().split(",");
		
		return null;
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
