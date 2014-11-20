package edu.cmu.capstone.polaris.error;

/**
 * This exception is thrown when the field to inquiry is not found.
 * @author tony
 *
 */
public class InquiryFieldNotExistException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4803572837447997163L;
	private String errorField;
	
	/**
	 * Constructor
	 * @param anErrorField - the unrecognized field
	 */
	public InquiryFieldNotExistException(String anErrorField){
		this.errorField = anErrorField;
	}
}
