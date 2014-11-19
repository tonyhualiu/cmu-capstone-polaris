package edu.cmu.capstone.polaris.error;

public class SearchResultNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9087452803836121125L;
	private String reason;
	
	public SearchResultNotFoundException(String possibleReason){
		reason = possibleReason;
	}

}
