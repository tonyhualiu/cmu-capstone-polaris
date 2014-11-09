package edu.cmu.capstone.polaris.entity;

public class GeneralInfoInquiryResponse extends GeneralCustomerInfo {

	private String source;
	private String maritalStatus;

	private String numOfChild;
	private String assignedAgent;
	private String residentStatus;
	private String urgency;
	private String annualIncome;
	private String company;
	private String industry;
	private String educationQulification;

	private String smokerStatus;
	private String clientCode;
	private String clientStatus;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNumOfChild() {
		return numOfChild;
	}

	public void setNumOfChild(String numOfChild) {
		this.numOfChild = numOfChild;
	}

	public String getAssignedAgent() {
		return assignedAgent;
	}

	public void setAssignedAgent(String assignedAgent) {
		this.assignedAgent = assignedAgent;
	}

	public String getResidentStatus() {
		return residentStatus;
	}

	public void setResidentStatus(String residentStatus) {
		this.residentStatus = residentStatus;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getEducationQulification() {
		return educationQulification;
	}

	public void setEducationQulification(String educationQulification) {
		this.educationQulification = educationQulification;
	}

	public String getSmokerStatus() {
		return smokerStatus;
	}

	public void setSmokerStatus(String smokerStatus) {
		this.smokerStatus = smokerStatus;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getClientStatus() {
		return clientStatus;
	}

	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}

}
