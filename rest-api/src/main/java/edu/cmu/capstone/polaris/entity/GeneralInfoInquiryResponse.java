package edu.cmu.capstone.polaris.entity;

import com.fasterxml.jackson.annotation.JsonView;

import edu.cmu.capstone.polaris.views.Views;
@Deprecated
public class GeneralInfoInquiryResponse extends GeneralCustomerInfo {

	@JsonView(Views.BasicView.class)
	private String source;
	@JsonView(Views.BasicView.class)
	private String maritalStatus;
	@JsonView(Views.BasicView.class)
	private String numOfChild;
	@JsonView(Views.BasicView.class)
	private String assignedAgent;
	@JsonView(Views.BasicView.class)
	private String residentStatus;
	@JsonView(Views.BasicView.class)
	private String urgency;
	@JsonView(Views.BasicView.class)
	private String annualIncome;
	@JsonView(Views.BasicView.class)
	private String company;
	@JsonView(Views.BasicView.class)
	private String industry;
	@JsonView(Views.BasicView.class)
	private String educationQulification;

	@JsonView(Views.BasicView.class)
	private String smokerStatus;
	@JsonView(Views.BasicView.class)
	private String clientCode;
	@JsonView(Views.BasicView.class)
	private String clientStatus;

	// JSON array for information
	@JsonView(Views.AddressView.class)
	private Address[] addressList;
	@JsonView(Views.EmailView.class)
	private Email[] emailList;
	@JsonView(Views.PhoneView.class)
	private Phone[] phoneList;
	@JsonView(Views.SocialAccountView.class)
	private SocialMedia[] socialAccountList;

	public GeneralInfoInquiryResponse() {

	}

	public GeneralInfoInquiryResponse(String str) {
		
	}

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

	public Address[] getAddressList() {
		return addressList;
	}

	public void setAddressList(Address[] addressList) {
		this.addressList = addressList;
	}

	public Email[] getEmailList() {
		return emailList;
	}

	public void setEmailList(Email[] emailList) {
		this.emailList = emailList;
	}

	public Phone[] getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(Phone[] phoneList) {
		this.phoneList = phoneList;
	}

	public SocialMedia[] getSocialAccountList() {
		return socialAccountList;
	}

	public void setSocialAccountList(SocialMedia[] socialAccountList) {
		this.socialAccountList = socialAccountList;
	}

}
