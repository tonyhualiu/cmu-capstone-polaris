package com.seec.insurance.common.model;

public class ResponseMessage {

	String confirmationId;// acknowledgement id
	String resultStatus; // {SUCCESS, FAILURE}
	String resultMessage; // application ErrorMessage
	String resultCode; // application ErrorCode
	String resultType; // {ERROR_MESSAGE, SUCCESS_MESSAGE, WARNING_MESSAGE 
	
	double totalRecordsFound = 0;

	/**
	 * @return the confirmationId
	 */
	public String getConfirmationId() {
		return confirmationId;
	}
	/**
	 * @param confirmationId the confirmationId to set
	 */
	public void setConfirmationId(String confirmationId) {
		this.confirmationId = confirmationId;
	}
	/**
	 * @return the resultStatus
	 */
	public String getResultStatus() {
		return resultStatus;
	}
	/**
	 * @param resultStatus the resultStatus to set
	 */
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	/**
	 * @return the resultMessage
	 */
	public String getResultMessage() {
		return resultMessage;
	}
	/**
	 * @param resultMessage the resultMessage to set
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	/**
	 * @return the resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}
	/**
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * @return the resultType
	 */
	public String getResultType() {
		return resultType;
	}
	/**
	 * @param resultType the resultType to set
	 */
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
	/**
	 * @return the totalRecordsFound
	 */
	public double getTotalRecordsFound() {
		return totalRecordsFound;
	}
	/**
	 * @param totalRecordsFound the totalRecordsFound to set
	 */
	public void setTotalRecordsFound(double totalRecordsFound) {
		this.totalRecordsFound = totalRecordsFound;
	}
}
