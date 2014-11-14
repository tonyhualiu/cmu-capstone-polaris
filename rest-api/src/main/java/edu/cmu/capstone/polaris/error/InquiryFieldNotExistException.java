package edu.cmu.capstone.polaris.error;

public class InquiryFieldNotExistException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4803572837447997163L;
	private String errorField;
	
	public InquiryFieldNotExistException(String anErrorField){
		this.errorField = anErrorField;
	}
}
