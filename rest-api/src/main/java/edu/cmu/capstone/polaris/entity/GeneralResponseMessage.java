package edu.cmu.capstone.polaris.entity;

import com.fasterxml.jackson.annotation.JsonView;

import edu.cmu.capstone.polaris.views.Views;

/**
 * This class contains the common information of search and inquiry
 * 
 * @author tony
 *
 */
public class GeneralResponseMessage {
	@JsonView(Views.BasicView.class)
	private String resultCode;
	@JsonView(Views.BasicView.class)
	private String resultString;
	@JsonView(Views.BasicView.class)
	private int totalRecordsFound;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultString() {
		return resultString;
	}

	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	public int getTotalRecordsFound() {
		return totalRecordsFound;
	}

	public void setTotalRecordsFound(int totalRecordsFound) {
		this.totalRecordsFound = totalRecordsFound;
	}

}
