package edu.cmu.capstone.polaris.error;

/**
 * This exception is thrown when the search result is not found due to the
 * reasons other than no record existing in database
 * 
 * @author tony
 *
 */
public class SearchResultNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9087452803836121125L;
	private String reason;
	
	/**
	 * Constructor
	 * @param possibleReason - the possible reason of search failure.
	 */
	public SearchResultNotFoundException(String possibleReason) {
		reason = possibleReason;
	}

}
